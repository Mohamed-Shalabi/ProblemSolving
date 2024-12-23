package leetcode

func rotate(nums []int, k int) {
	if len(nums) == 1 {
		return
	}

	if k > len(nums) {
		k = k % len(nums)
	}

	index := len(nums) - k
	p1, p2 := append([]int{}, nums[:index]...), append([]int{}, nums[index:]...)

	copy(p2, nums)

	for i, e := range p1 {
		nums[len(p2)+i] = e
	}
}
