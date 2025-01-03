class Solution {
  bool canJump(List<int> nums) {
    var i = 0;
    while (i < nums.length) {
      if (i == nums.length - 1) {
        return true;
      }

      final num = nums[i];
      if (num == 0 && i != nums.length - 1) {
        return false;
      }

      var max = 0;
      var newI = i;
      for (var j = i + 1; j <= i + num; j++) {
        if (j >= nums.length) {
          return true;
        }

        if (j + nums[j] >= max) {
          max = j + nums[j];
          newI = j;
        }
      }

      i = newI;
    }

    return true;
  }
}
