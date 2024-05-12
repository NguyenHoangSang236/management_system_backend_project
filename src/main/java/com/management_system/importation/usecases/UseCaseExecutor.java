package com.management_system.importation.usecases;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public interface UseCaseExecutor {
    <Any, In extends UseCase.InputValue, Out extends UseCase.OutputValue> CompletableFuture<Any> execute(
        UseCase<In, Out> useCase,
        In input,
        Function<Out, Any> outputMapper
    );
}
