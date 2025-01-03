class Solution {
  int maxProfit(List<int> prices) {
    var min = prices.first;
    var profit = 0;
    for (final n in prices) {
      if (n > min) {
        if (n - min > profit) {
          profit = n - min;
        }
      } else {
        min = n;
      }
    }

    return profit;
  }
}
