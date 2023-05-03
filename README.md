# ComputionalMath-Lab3
Численное интегрирование
Среди методов численного интегрирования вам будет предложено реализовать один из 
следующих методов:
1. Метод прямоугольников;
2. Метод трапеций;
3. Метод Симпсона (метод парабол).

При расчёте интеграла необходимо учитывать ОДЗ функции и необходимые и достаточные условия существования определённого интеграла. 
Если на интервале интегрирования существует устранимый разрыв первого рода, то его следует устранить одним из способов 
(с уточнением пользователю, каким именно способом Вы собираетесь его устранять) и выполнить расчёт интеграла. 
Например, может быть выполнен расчёт левой части интеграла от разрыва и правой в отдельности. 
Альтернативным методом устранения разрыва будет принять алгоритмическое среднее от значения от двух соседних точках функции 𝑓(𝑥−𝜀),𝑓(𝑥+𝜀), 
где 𝜀 – наперёд заданная малая постоянная, которая может быть зависима от текущего шага разбиения интеграла. 
В обоих случаях Вы должны продумать стратегию алгоритма устранения разрыва при попадании его на самую границу интервала. 
Важным вопросом, который надо рассмотреть в данной лабораторной работе – погрешность квадратурных формул интегрирования,
соответственно обозначаемых как 𝑟𝑖 на каждом разбиении интеграла и 𝑅 на глобальном интервале [𝑎;𝑏], на котором производится 
интегрирование функции. На основании того факта, что интеграл по определению является пределом суммы бесконечно малых разбиений, 
без уточнений как именно это разбиение будет производиться, то в пределе абсолютно все методы численного интегрирования будут давать 
верный результат при правильном их применении. Поэтому для сравнения методов между собой следует анализировать максимальную 
величину шага разбиения, либо количество разбиений (особенно для методов с динамическим, а не постоянным шагом). 
В прямую это можно сделать при помощи сравнения полученного значения интеграла с его аналитическим значением, рассчитанным, 
например, по формуле Ньютона-Лейбница или табличных значений интеграла. Однако, для глобальных выводов необходимо также 
анализировать погрешности самих квадратурных формул 𝑅, которые также дают ответ на то, какие функции следует интегрировать 
при помощи тех или иных численных методов интегрирования. Ваши рассуждения, наблюдения и результаты анализа и должны составлять 
основу вывода в данной лабораторной работе. 