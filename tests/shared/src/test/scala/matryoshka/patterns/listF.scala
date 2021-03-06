/*
 * Copyright 2014–2017 SlamData Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package matryoshka.patterns

import matryoshka._
import matryoshka.helpers._
import matryoshka.scalacheck.arbitrary._

import java.lang.String
import scala.Int
import scala.Predef.{implicitly => imp}

import org.scalacheck._
import org.specs2.ScalaCheck
import org.specs2.mutable._
import scalaz._, Scalaz._
import scalaz.scalacheck.ScalazProperties._

class ListFSpec extends Specification with ScalaCheck with AlgebraChecks {
  "ListF" >> {
    addFragments(properties(equal.laws[ListF[String, Int]]))
    addFragments(properties(bitraverse.laws[ListF]))

    checkAlgebraIsoLaws(
      "ListF ⇔ List", ListF.listIso[Int])(
      Arbitrary(Gen.listOf(Arbitrary.arbInt.arbitrary)), imp, imp, imp, imp)
  }
}
