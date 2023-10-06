# Написать скрипт для расчета корреляции Пирсона между
# двумя случайными величинами (двумя массивами). Можете
# использовать любую парадигму, но рекомендую использовать
# функциональную, т.к. в этом примере она значительно
# упростит вам жизнь.
# Функция для вычисления среднего значения
def mean(arr):
    return sum(arr) / len(arr)

# Функция для вычисления корреляции Пирсона
def pearson_correlation(x, y):
    # Проверяем, что массивы одинаковой длины
    if len(x) != len(y):
        raise ValueError("Массивы должны иметь одинаковую длину")

    # Вычисляем средние значения для x и y
    mean_x = mean(x)
    mean_y = mean(y)

    # Вычисляем числитель и знаменатель для формулы корреляции Пирсона
    numerator = sum((xi - mean_x) * (yi - mean_y) for xi, yi in zip(x, y))
    denominator_x = sum((xi - mean_x) ** 2 for xi in x)
    denominator_y = sum((yi - mean_y) ** 2 for yi in y)

    # Вычисляем корреляцию Пирсона
    correlation = numerator / (denominator_x ** 0.5 * denominator_y ** 0.5)

    return correlation
