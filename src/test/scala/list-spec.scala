package com.yuvimasory.ninetynine

/* we're not using the standard library's List */
import scala.{ List => _, Nil => _, :: => _ }
import scala.collection.immutable.{ List => _, Nil => _, :: => _ }

import org.specs2._
import ListProblems._

class ListProblemsSpec extends Specification { def is =
  "P01 example" ! {
    true
  } ^
  "P02 example" ! {
    true
  } ^
  "P03 example" ! {
    true
  } ^
  "P04 example" ! {
    true
  } ^
  "P05 example" ! {
    true
  } ^
  end
}
