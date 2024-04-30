package org.example.reactive.section4;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class OperatorsInAction {
    public static void main(String[] args) {

        Observable<Employee> obs = Observable.just(
                new Employee(101, "Alexa", 60000, 4.0),
                new Employee(123, "Dhwanit", 94000, 4.7),
                new Employee(236, "Mike", 65000, 4.0),
                new Employee(155, "Ella", 85000, 4.4),
                new Employee(443, "George", 50000, 3.6),
                new Employee(127, "Shreeja", 85000, 4.5),
                new Employee(509, "Daniel", 60000, 4.0),
                new Employee(344, "Lucy", 94000, 4.7),
                new Employee(509, "Harry", 75000, 4.3),
                new Employee(344, "Emma", 55000, 3.7)
        );

        obs
                .filter(e -> e.getRating() > 4.0)
                .sorted((e1, e2) -> Double.compare(e2.getRating(), e1.getRating()))
                .map(Employee::getName)
                .take(4)
                .subscribe(System.out::println);

        List<Integer> expenses = List.of(200, 500, 300, 340, 129, 234, 999, 1030, 3400, 890, 996, 789);

        Observable.fromIterable(expenses)
                .reduce((a, b) -> a + b)
                .subscribe(System.out::println);

        Observable.just(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .scan((x, y) -> x + y)
                .subscribe(System.out::println);

        obs
                .map(Employee::getSalary)
                .reduce(Double::sum)
                .subscribe(System.out::println);

        Double totalSlary = obs
                .map(Employee::getSalary)
                .reduce(Double::sum)
                .toSingle()
                .blockingGet();
        System.out.println(totalSlary);

    }
}
