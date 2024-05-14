package leetcode

func DifferenceOfSums(n int, m int) int {
	sum := (n + 1) * n / 2
	k := n / m

	divisiblesSum := m * (k + 1) * k / 2

	indivisiblesSum := sum - divisiblesSum

	return indivisiblesSum - divisiblesSum
}
