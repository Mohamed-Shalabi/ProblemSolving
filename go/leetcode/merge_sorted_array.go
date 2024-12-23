package leetcode

func merge(nums1 []int, m int, nums2 []int, n int) {
	p1, p2 := m-1, n-1

	for p1 >= 0 || p2 >= 0 {
		if p1 < 0 {
			for i := 0; i <= p2; i++ {
				nums1[i] = nums2[i]
			}
			break
		}

		if p2 < 0 {
			break
		}

		n1, n2 := nums1[p1], nums2[p2]
		if nums1[p1] < nums2[p2] {
			nums1[p1+p2+1] = n2
			p2--
		} else {
			nums1[p1+p2+1] = n1
			p1--
		}
	}
}
