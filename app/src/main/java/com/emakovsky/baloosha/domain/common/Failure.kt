package com.emakovsky.baloosha.domain.common

sealed class Failure(message: String) : Throwable(message) {

    class NoData : Failure("NoData")
    class UnknownFailure(message: String) : Failure(message)

}