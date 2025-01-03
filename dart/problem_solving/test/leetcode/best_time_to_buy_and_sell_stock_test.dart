import 'package:problem_solving/leetcode/best_time_to_buy_and_sell_stock.dart'
    as p;
import 'package:test/test.dart';

void main() {
  group(
    'Tests for "Best Time To Buy And Sell Stock"',
    () {
      late p.Solution solution;

      setUp(
        () {
          solution = p.Solution();
        },
      );

      test(
        'case 1',
        () {
          final res = solution.maxProfit([7, 1, 5, 3, 6, 4]);
          expect(res, equals(5));
        },
      );

      test(
        'case 2',
        () {
          final res = solution.maxProfit([7, 6, 4, 3, 1]);
          expect(res, equals(0));
        },
      );
    },
  );
}
