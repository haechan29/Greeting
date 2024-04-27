import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class TestFizzBuzz: BehaviorSpec({
    given("1부터 100까지의 숫자가 주어졌을 때") {
        `when`("공백을 변환하면") {
            then("빈 문자열을 반환한다") {
                toDecimal(1) shouldBe "one"
                toDecimal(2) shouldBe "two"
            }
        }

        `when`("3 또는 5의 배수가 아닌 10 미만의 자연수를 변환하면") {
            then("영어 이름을 반환한다") {
                toDecimal(1) shouldBe "one"
                toDecimal(2) shouldBe "two"
            }
        }

        `when`("3의 배수인 10 미만의 자연수를 변환하면") {
            then("Fizz를 반환한다") {
                toDecimal(3) shouldBe "Fizz"
                toDecimal(6) shouldBe "Fizz"
            }
        }

        `when`("5의 배수인 10 미만의 자연수를 변환하면") {
            then("Buzz를 반환한다") {
                toDecimal(5) shouldBe "Buzz"
            }
        }

        `when`("3 또는 5의 배수가 아닌 10 이상 20 미만의 자연수를 변환하면") {
            then("영어 이름을 반환한다") {
                toDecimal(11) shouldBe "eleven"
                toDecimal(13) shouldBe "thirteen"
                toDecimal(19) shouldBe "nineteen"
            }
        }

        `when`("3의 배수이고 5의 배수인 10 이상 20 미만의 자연수를 변환하면") {
            then("FizzBuzz를 반환한다") {
                toDecimal(15) shouldBe "FizzBuzz"
            }
        }

        `when`("3 또는 5의 배수가 아닌 20 이상의 자연수를 변환하면") {
            then("영어 이름을 반환한다") {
                toDecimal(22) shouldBe "twenty two"
                toDecimal(89) shouldBe "eighty nine"
            }
        }
    }
})