# АЛГОРИТМ #
Один из возможных алгоритмов может быть такой:

- Реверсировать все элементы массива A
- Реверсировать первые m элементы
- Реверсировать оставшуюся часть массива (от m+1 до n)

Этот алгоритм занимает 3n/2 действия, что является линейным в отношении n.

# КОД #
Этот код сначала реверсирует все элементы массива A с помощью функции reverse, затем реверсирует первые m элементов и наконец реверсирует оставшуюся часть массива (от m+1 до n) снова используя функцию reverse. Метод moveFirstMElementsToEnd принимает массив A и число m, и переставляет первые m элементов в конец массива.

# ТЕСТЫ #
В первом тесте мы создаем массив A с 8 элементами и задаем m = 4 , затем вызываем метод moveFirstMElementsToEnd(A, m) и проверяем результат с ожидаемым массивом.
Во втором тесте, мы создаем массив A с 8 элементами и задаем начало и конец для реверса (2, 5) и проверяем результат с ожидаемым массивом.