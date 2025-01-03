class Solution {
  int jump(List<int> nums) {
    var i = 0;
    var jumps = 0;
    while (i < nums.length) {
      if (i == nums.length - 1) {
        break;
      }

      final num = nums[i];

      var max = 0;
      var newI = i;
      for (var j = i + 1; j <= i + num; j++) {
        if (j >= nums.length - 1) {
          newI = nums.length - 1;
          break;
        }

        if (j + nums[j] >= max) {
          max = j + nums[j];
          newI = j;
        }
      }

      i = newI;
      jumps += 1;
    }

    return jumps;
  }
}
