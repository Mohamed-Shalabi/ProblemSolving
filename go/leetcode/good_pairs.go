package leetcode

func NumIdenticalPairs(nums []int) int {
	var result int

	occurrences := countOccurrences(nums)
	for _, value := range occurrences {
		result += binomial(value)
	}

	return result
}

func binomial(n int) int {
	return (n * (n - 1)) / 2
}

func countOccurrences(arr []int) map[int]int {
	frequency := make(map[int]int)
	for _, item := range arr {
		frequency[item]++
	}
	return frequency
}
