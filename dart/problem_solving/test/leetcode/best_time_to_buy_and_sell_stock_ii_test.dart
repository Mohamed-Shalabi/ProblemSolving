import 'package:problem_solving/leetcode/best_time_to_buy_and_sell_stock_ii.dart'
    as p;
import 'package:test/test.dart';

void main() {
  group(
    'Tests for "Best Time To Buy And Sell Stock II"',
    () {
      late p.Solution solution;

      setUp(
        () {
          solution = p.Solution();
        },
      );

      test(
        'Two days, the second is higher',
        () {
          final res = solution.maxProfit([1, 5]);
          expect(res, equals(4));
        },
      );

      test(
        'Two days, the second is lower',
        () {
          final res = solution.maxProfit([5, 1]);
          expect(res, equals(0));
        },
      );

      test(
        'Multiple days, only incrementing',
        () {
          final res = solution.maxProfit([1, 4, 5]);
          expect(res, equals(4));
        },
      );

      test(
        'Multiple days, only decrementing',
        () {
          final res = solution.maxProfit([5, 4, 1]);
          expect(res, equals(0));
        },
      );

      test(
        'Multiple days, decrementing then incrementing',
        () {
          final res = solution.maxProfit([5, 4, 1, 3]);
          expect(res, equals(2));
        },
      );

      test(
        'Multiple days, incrementing then decrementing',
        () {
          final res = solution.maxProfit([1, 4, 3, 2]);
          expect(res, equals(3));
        },
      );

      test(
        'Multiple days, a day having zero',
        () {
          final res = solution.maxProfit([2, 1, 2, 0, 1]);
          expect(res, equals(2));
        },
      );
    },
  );
}
