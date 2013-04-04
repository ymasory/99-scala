package com.yuvimasory.ninetynine

import scala.annotation.tailrec

/* hide standard library's List and Pair */
import scala.{ List => _, Nil => _, :: => _ }
import scala.collection.immutable.{ List => _, Nil => _, :: => _ }
import scala.Predef.{ Pair => _ }

object ListProblems {

  /* utilities */
  def TODO: Nothing = sys error "todo"

  /* definition of List  */

  sealed trait List[+A] {
    def ::[B >: A](value: B): List[B] =
      com.yuvimasory.ninetynine.ListProblems.::(value, this)
  }
  object Nil extends List[Nothing]
  case class ::[A](head: A, tail: List[A]) extends List[A]

  /* definition of Pair */
  case class Pair[A, B](_1: A, _2: B)

  /* we need the Equal typeclass */

  trait Equal[A] {
    def eqs(fst: A, snd: A): Boolean
    def neqs(fst: A, snd: A): Boolean = ! eqs(fst, snd)
  }

  implicit class EqualOps[A](value: A)(implicit e: Equal[A]) {
    def ===(that: A) = e eqs (value, that)
    def =/=(that: A) = e neqs (value, that)
  }

  implicit def ListEqual[A:Equal]: Equal[List[A]] = new Equal[List[A]] {
    override def eqs(fst: List[A], snd: List[A]): Boolean =
      Pair(fst, snd) match {
        case Pair(Nil, Nil)             => true
        case Pair(fh :: ft, sh :: st)   => fh === sh && eqs(ft, st)
        case _                          => false
      }
  }

  implicit def PairEqual[A:Equal, B:Equal]: Equal[Pair[A, B]] =
    new Equal[Pair[A, B]] {
      override def eqs(fst: Pair[A, B], snd: Pair[A, B]): Boolean =
        fst._1 === snd._1 && fst._2 === snd._2
    }

  implicit object IntEqual extends Equal[Int] {
    def eqs(i: Int, j: Int) = i == j
  }

  /* P01 */
  @tailrec def last[A](lst: List[A]): Option[A] = lst match {
    case Nil      => None
    case h :: Nil => Some(h)
    case _ :: t   => last(t)
  }

  /* P02 */
  @tailrec def penultimate[A](lst: List[A]): Option[A] = lst match {
    case Nil           => None
    case p :: _ :: Nil => Some(p)
    case _ :: t        => penultimate(t)
  }

  /* P03 */
  @tailrec def nth[A](i: Int, lst: List[A]): Option[A] =
    if (i < 0) None
    else lst match {
      case Nil    => None
      case h :: t => if (i === 0) Some(h) else nth(i - 1, t)
    }

  /* P04 */
  @tailrec def length[A](lst: List[A], acc: Int = 0): Int = lst match {
    case Nil    => 0
    case _ :: t => length(t, acc + 1)
  }

  /* P05 */
  @tailrec def reverse[A](lst: List[A], acc: List[A] = Nil): List[A] =
    lst match {
      case Nil    => acc
      case h :: t => reverse(t, ::(h, acc))
    }

  /* P06 */
  def isPalindrome[A:Equal](lst: List[A]): Boolean = lst === reverse(lst)

  /* P07 */
  @tailrec def flatten[A](lst: List[List[A]], acc: List[A] = Nil): List[A] =
    lst match {
      case Nil              => acc
      case Nil :: xss       => flatten(xss, acc)
      case (x :: xs) :: xss => flatten(xs :: xss, x :: acc)
    }

  /* P08 */
  def compress[A](lst: List[A]): List[A] = TODO

  /* P09 */
  def pack[A](lst: List[A]): List[List[A]] = TODO

  /* P10 */
  def encode[A](lst: List[A]): List[(Int, A)] = TODO

  /* P11 */
  def encodeModified[A](lst: List[A]): List[Any] = TODO

  /* P12 */
  def decode[A](lst: List[(Int, A)]): List[A] = TODO

  /* P13 */
  def encodeDirect[A](lst: List[A]): List[(Int, A)] = TODO

  /* P14 */
  def duplicate[A](lst: List[A]): List[A] = TODO

  /* P15 */
  def duplicateN[A](i: Int, lst: List[A]): List[A] = TODO

  /* P16 */
  def drop[A](i: Int, lst: List[A]): List[A] = TODO

  /* P17 */
  def split[A](i: Int, lst: List[A]): (List[A], List[A]) = TODO

  /* P18 */
  def slice[A](i: Int, j: Int, lst: List[A]): List[A] = TODO

  /* P19 */
  def rotate[A](i: Int, lst: List[A]): List[A] = TODO

  /* P20 */
  def removeAt[A](i: Int, lst: List[A]): List[A] = TODO

  /* P21 */
  def insertAt[A](value: A, i: Int, lst: List[A]): List[A] = TODO

  /* P22 */
  def range[A](i: Int, j: Int): List[Int] = TODO

  /* P23 */
  def randomSelect[A](i: Int, lst: List[A]): List[A] = TODO

  /* P24 */
  def lotto[A](i: Int, j: Int): List[Int] = TODO

  /* P25 */
  def randomPermute[A](lst: List[A]): List[A] = TODO

  /* P26 */
  def combinations[A](i: Int, lst: List[A]): List[List[A]] = TODO

  /* P27a */
  def group3[A](lst: List[Int]): List[List[List[A]]] = TODO

  /* P27b */
  def group[A](lens: List[Int], lst: List[A]): List[List[List[A]]] = TODO

  /* P28a */
  def lsort[A](lst: List[List[A]]): List[List[A]] = TODO

  /* P28b */
  def lsortFreq[A](lst: List[List[A]]): List[List[A]] = TODO
}
