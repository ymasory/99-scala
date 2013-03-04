package com.yuvimasory

object ListProblems {

  /* P01 */
  def last[A](lst: List[A]): A = ???

  /* P02 */
  def penultimate[A](lst: List[A]): A = ???

  /* P03 */
  def nth[A](lst: List[A]): A = ???

  /* P04 */
  def length[A](lst: List[A]): Int = ???

  /* P05 */
  def reverse[A](lst: List[A]): List[A] = ???

  /* P06 */
  def isPalindrome[A](lst: List[A]): Boolean = ???

  /* P07 */
  def flatten[A](lst: List[List[A]]): List[A] = ???

  /* P08 */
  def compress[A](lst: List[A]): List[A] = ???

  /* P09 */
  def pack[A](lst: List[A]): List[List[A]] = ???

  /* P10 */
  def encode[A](lst: List[A]): List[(Int, A)] = ???

  /* P11 */
  def encodeModified[A](lst: List[A]): List[Any] = ???

  /* P12 */
  def decode[A](lst: List[(Int, A)]): List[A] = ???

  /* P13 */
  def encodeDirect[A](lst: List[A]): List[(Int, A)] = ???

  /* P14 */
  def duplicate[A](lst: List[A]): List[A] = ???

  /* P15 */
  def duplicateN[A](i: Int, lst: List[A]): List[A] = ???

  /* P16 */
  def drop[A](i: Int, lst: List[A]): List[A] = ???

  /* P17 */
  def split[A](i: Int, lst: List[A]): (List[A], List[A]) = ???

  /* P18 */
  def slice[A](i: Int, j: Int, lst: List[A]): List[A] = ???

  /* P19 */
  def rotate[A](i: Int, lst: List[A]): List[A] = ???

  /* P20 */
  def removeAt[A](i: Int, lst: List[A]): List[A] = ???

  /* P21 */
  def insertAt[A](value: A, i: Int, lst: List[A]): List[A] = ???

  /* P22 */
  def range[A](i: Int, j: Int): List[Int] = ???

  /* P23 */
  def randomSelect[A](i: Int, lst: List[A]): List[A] = ???

  /* P24 */
  def lotto[A](i: Int, j: Int): List[Int] = ???

  /* P25 */
  def randomPermute[A](lst: List[A]): List[A] = ???

  /* P26 */
  def combinations[A](i: Int, lst: List[A]): List[List[A]] = ???

  /* P27a */
  def group3[A](lst: List[Int]): List[List[List[A]]] = ???

  /* P27b */
  def group[A](lens: List[Int], lst: List[A]): List[List[List[A]]] = ???

  /* P28a */
  def lsort[A](lst: List[List[A]]): List[List[A]] = ???

  /* P28b */
  def lsortFreq[A](lst: List[List[A]]): List[List[A]] = ???
}
