
# 2. Введение в ООП. Инкапсуляция

## Что нужно сделать

Ваша задача — создать структуру классов для интернет-магазина. Над этой структурой вы будете работать еще в нескольких домашках, поэтому сохраните этот проект.

- Создайте обычное Java-приложение с одним классом 
    
    ```
    App
    ```
    
     и методом 
    
    ```
    main()
    ```
    
    .
- Сделайте коммит в ветку main(master).
- После этого создайте новую ветку и выполните в ней домашнее задание.

### Описание структуры

Пока наш интернет-магазин будет содержать только классы товаров и корзины для товаров. Эти классы нужно создать с учетом принципа инкапсуляции и разнести по пакетам.

> Выполняйте задание строго по шагам. Пока не сделали предыдущий шаг — не приступайте к следующему.

### Создание корневого пакета

1. Создайте в папке 
    
    ```
    src
    ```
    
     пакет с названием 
    
    ```
    org.skypro.skyshop
    ```
    
    . Этот пакет будет корневым для всех остальных пакетов в нашем приложении.
2. Перенесите в этот пакет класс 
    
    ```
    App
    ```
    
     с методом 
    
    ```
    main
    ```
    
    . Его нужно обязательно перенести, а не копировать. Для переноса можно использовать Drag and Drop или комбинацию клавиш «Вырезать»/«Вставить».

> Для последующих домашних заданий этого курса вам нужно создавать корневой пакет, иначе работа не будет принята.

### Создание класса товара

Создайте в пакете 

```
org.skypro.skyshop.product
```

 класс товара 

```
Product
```

, который будет содержать два значения:

- название продукта в виде строки,
- стоимость продукта в виде целого числа.

> Эти значения должны быть немодифицируемыми после создания объекта, но должна быть возможность получить эти значения в других классах.

Подсказка

Если значения должны быть немодифицируемыми — это значит, что в нашем классе должен быть единственный конструктор, принимающий эти значения. Сами поля должны иметь модификатор 

```
private
```

, а доступ к ним должен осуществляться с помощью геттеров.

### Создание класса корзины для товаров

Создайте простой класс корзины 

```
ProductBasket
```

 в пакете 

```
org.skypro.skyshop.basket
```

.

Этот класс содержит в себе одну корзину с продуктами, которые купил один пользователь. Вам нужно реализовать следующие публичные методы:

1. Метод добавления продукта в корзину: метод принимает в себя продукт и ничего не возвращает.
2. Метод получения общей стоимости корзины: метод ничего не принимает и возвращает целое число.
3. Метод, который печатает содержимое корзины: метод ничего не принимает и не возвращает, но печатает в консоль сообщение вида:
    
    ```
    <имя продукта>: <стоимость>
    <имя продукта>: <стоимость>
    <имя продукта>: <стоимость>
    Итого: <общая стоимость корзины>
    ```
    
    > Если в корзине ничего нет, нужно напечатать фразу «в корзине пусто».
    
4. Метод, проверяющий продукт в корзине по имени: метод принимает в себя строку имени и возвращает 
    
    ```
    boolean
    ```
    
     в зависимости от того, есть продукт в корзине или его нет.
5. Метод очистки корзины: метод ничего не принимает и очищает массив, проставляя всем его элементам 
    
    ```
    null
    ```
    
    .

> Обратите внимание!
> 
> 1. В качестве хранилища для объектов product используйте массив из пяти элементов, однако прямой доступ к этому массиву должен быть невозможен.
> 2. Если в массиве не хватает места на следующий продукт, то метод добавления продукта должен выводить в консоль сообщение вида: «Невозможно добавить продукт».

### Демонстрация классов

Создайте в классе 

```
App
```

 в методе 

```
main
```

 несколько продуктов и продемонстрируйте работу всех методов корзины по следующему сценарию:

1. Добавление продукта в корзину.
2. Добавление продукта в заполненную корзину, в которой нет свободного места.
3. Печать содержимого корзины с несколькими товарами.
4. Получение стоимости корзины с несколькими товарами.
5. Поиск товара, который есть в корзине.
6. Поиск товара, которого нет в корзине.
7. Очистка корзины.
8. Печать содержимого пустой корзины.
9. Получение стоимости пустой корзины.
10. Поиск товара по имени в пустой корзине.

### Рекомендации по выполнению работы

1. Используйте модификатор 
    
    ```
    static
    ```
    
     только в методе 
    
    ```
    main
    ```
    
    , а модификатор 
    
    ```
    public
    ```
    
    — только для методов и конструкторов.
2. Для демонстрации классов можно создать несколько корзин.

Критерии оценки

- Создан корневой пакет 
    
    ```
    org.skypro.skyshop
    ```
    
    .
- Класс 
    
    ```
    App
    ```
    
     с методом 
    
    ```
    main
    ```
    
     находится в корневом пакете.
- Создан класс 
    
    ```
    Product
    ```
    
     в пакете 
    
    ```
    org.skypro.skyshop.product
    ```
    
    .
- Класс 
    
    ```
    Product
    ```
    
     написан согласно требованиям и принципу инкапсуляции.
- Создан класс 
    
    ```
    ProductBasket
    ```
    
     в пакете 
    
    ```
    org.skypro.skyshop.basket
    ```
    
    .
- Класс 
    
    ```
    Basket
    ```
    
     написан согласно требованиям и принципу инкапсуляции.
- Все методы класса 
    
    ```
    Basket
    ```
    
     продемонстрированы согласно сценарию в пункте «Демонстрация классов».
- Код проекта отформатирован.
- Проект компилируется и выполняется, нет ошибок, приводящих к «падению» программы при выполнении.
- Проект не содержит неиспользуемых классов и методов, а также закомментированного кода (можно добавить текстовые комментарии для разъяснения сложных моментов в коде).

# 3. ООП: наследование, абстрактные классы

## Что нужно сделать

Мы продолжаем работать над структурой классов для интернет-магазина. В этом задании вам предстоит применить наследование, чтобы обеспечить разные типы продуктов для интернет-магазина, а также расширить функциональность корзины.

> Сделайте домашнюю работу в том же проекте, что и задание предыдущего урока — «Введение в ООП. Инкапсуляция».

Для этого нужно:

1. Сделать merge вашего pull request на GitHub с предыдущей домашкой в мастер-ветку.
2. Переключиться в IDEA на мастер-ветку и обновить ее с помощью пункта меню Update.
  

![](https://cdn-user36618.skyeng.ru/skyconvert/unsafe/fit-in/1368x/https://cdn-user12724.skyeng.ru/image/b038cf9733d1aab66f5715ca622b2b06.png)

  
6. После этого создать из мастер-ветки новую ветку и выполнить в ней домашнюю работу.
7. После завершения работы создать новый pull request на GitHub.

## Описание структуры

Интернет-магазин начинает поддерживать новые типы товаров, а значит, нужно расширить модель классов, чтобы поддерживать эти типы. Для этого:

- создадим классы для товаров со скидкой и товаров с фиксированной ценой,
- поменяем вывод данных в корзине,
- добавим новые методы для товаров и корзины.

> Выполняйте задание строго по порядку. Пока не сделали предыдущий шаг — не приступайте к следующему.

### 1. Выделение корня иерархии

Чтобы поддерживать новые типы товаров, нужно создать иерархию наследования для них.

- Сделайте класс 
    
    ```
    Product
    ```
    
     абстрактным и уберите из него поле цены.
- Так как цены у нас нет, метод 
    
    ```
    getPrice()
    ```
    
     тоже должен стать абстрактным.
- Класс 
    
    ```
    Product
    ```
    
     станет новым корнем иерархии, от него будем наследовать специфические классы товаров.

> Обратите внимание! После этого шага проект не будет компилироваться и запускаться. Так как в методе 
> 
> ```
> main
> ```
> 
>  класса 
> 
> ```
> App
> ```
> 
>  мы создаем товары через оператор 
> 
> ```
> new
> ```
> 
> , а абстрактные классы создавать через оператор 
> 
> ```
> new
> ```
> 
>  нельзя.

### 2. Создание класса обычного товара

- Восстановите функциональность кода: сделайте класс 
    
    ```
    SimpleProduct
    ```
    
    , который наследуется от 
    
    ```
    Product
    ```
    
     и принимает в свой конструктор (кроме имени) обычную цену товара, а переопределенный метод 
    
    ```
    getPrice
    ```
    
     возвращает эту цену.
- Когда вы замените классом 
    
    ```
    SimpleProduct
    ```
    
     класс 
    
    ```
    Product
    ```
    
     в методе 
    
    ```
    main
    ```
    
    , то получите полностью рабочий проект, в котором работает демонстрация.

> Обратите внимание! Класс корзины на этом этапе менять нельзя, и это не должно потребоваться. Если класс корзины не компилируется или какие-то методы в нем показывают ошибку, это значит, что вы неправильно выделили абстрактный класс или пропустили какой-то шаг.

### 3. Создание класса товара со скидкой

- Расширим иерархию классов. Для этого сделайте класс товара со скидкой 
    
    ```
    DiscountedProduct
    ```
    
    . Этот класс нужно унаследовать от 
    
    ```
    Product
    ```
    
    .
- В этом классе создайте два поля — «базовая цена» и «скидка в целых процентах». Скидка может быть только положительным целым числом от 0 до 100. Проверку на это не нужно делать, достаточно просто учитывать при написании методов.
- Переопределите метод 
    
    ```
    getPrice
    ```
    
     так, чтобы он учитывал скидку, которую вы применили к товару.

### 4. Создание класса товара с фиксированной ценой

В нашем интернет-магазине есть типы товаров с фиксированной ценой — fix price. Цена назначается один раз в год, поэтому в данный момент ее выгоднее установить в коде, используя константу.

- Создайте класс 
    
    ```
    FixPriceProduct
    ```
    
    , конструктор которого принимает только имя продукта, а метод 
    
    ```
    getPrice
    ```
    
     возвращает некоторую фиксированную цену.
- Саму фиксированную цену нужно оформить в виде приватной константы в классе 
    
    ```
    FixPriceProduct
    ```
    
    .

> Константы в Java — это 
> 
> ```
> static-
> ```
> 
>  и 
> 
> ```
> final
> ```
> 
> -переменные в классе. Имена констант используют специальный вид написания под названием SCREAMING_SNAKE_CASE.

Если какое-то значение постоянно повторяется в программе, вы можете сохранить его в константе и использовать константу вместо непосредственного значения.

```
// Пример объявления константы
private static final String USER_GREETING = "Hello user!";

// Пример константы в классе java.lang.Math, она выделена для понимания,
// что последовательность цифр 3.14159265358979323846 — это число пи
public static final double PI = 3.14159265358979323846;
```

### 5. Изменение вывода корзины в классе ProductBacket

- Измените метод вывода, который печатает содержимое корзины, чтобы результат выводился в следующем виде:

```
<имя продукта>: <стоимость>
<имя продукта со скидкой>: <стоимость> (<скидка>%)
<имя продукта c фиксированной ценой>: Фиксированная цена <значение константы фиксированной цены>
Итого: <общая стоимость корзины>
Специальных товаров: <Количество специальных товаров>
```

Специальный товар — это товар со скидкой или фиксированной стоимостью.

Чтобы правильно написать данный метод, вам нужно:

- переопределить метод 
    
    ```
    toString
    ```
    
     в классах товаров так, чтобы вызов 
    
    ```
    toString
    ```
    
     у товара выводил строку нужного формата (как на примере выше).

Для подсчета количества специальных товаров:

- добавьте в абстрактный класс товара метод 
    
    ```
    isSpecial
    ```
    
    , который возвращает 
    
    ```
    true
    ```
    
     или 
    
    ```
    false
    ```
    
     и переопределяет его в других классах товаров.

> Обратите внимание! В этом задании нельзя использовать оператор 
> 
> ```
> instanceof
> ```
> 
>  или другие методы, которые определяют класс товара. Используйте переопределение методов или вводите новые методы.

### 6. Проверка изменений

1. Создайте в методе 
    
    ```
    main
    ```
    
     несколько товаров специальных типов вместо 
    
    ```
    SimpleProduct
    ```
    
    .
2. Проверьте, что все методы выводят правильные значения.
3. Убедитесь, что метод печати содержимого корзины выводит результат в нужной форме.

Критерии оценки

- Класс 
    
    ```
    Product
    ```
    
     помечен как абстрактный.
- Созданы три новых класса для товаров — 
    
    ```
    SimpleProduct
    ```
    
    , 
    
    ```
    DiscountProduct
    ```
    
     и 
    
    ```
    FixPriceProduct
    ```
    
    .
- Новые классы товаров унаследованы от класса 
    
    ```
    Product
    ```
    
     и реализованы согласно требованиям.
- Вывод новых классов товаров при печати корзины реализован согласно условиям в задании.
- В методе 
    
    ```
    main
    ```
    
     созданы объекты всех трех новых классов товаров и добавлены в корзину.
- Код проекта отформатирован.
- Проект компилируется и выполняется, нет ошибок, приводящих к «падению» программы при выполнении.
- Проект не содержит неиспользуемых классов и методов, а также закомментированного кода (можно добавить текстовые комментарии для разъяснения сложных моментов в коде).


# 4. ООП: полиморфизм, интерфейсы


## Что нужно будет сделать

В этой домашней работе мы добавим в приложение интернет-магазина новую сущность и сделаем движок для поиска по товарам.

> Сделайте это задание в новой ветке «старого» проекта, где выполняли предыдущую домашку. За основу возьмите результат вашей работы по наследованию.

## 1. Создание новой сущности

Наш интернет-магазин растет, и мы решили добавить в объектную модель статьи о товарах.

Для этого создайте класс 

```
Article
```

, который будет немодифицируемым, как и класс товара, и будет содержать такой набор полей:

- название статьи в виде строки,
- текст статьи в виде строки.

Добавьте в класс метод 

```
toString
```

, который будет преобразовывать статью в строку такого вида:

```
Название статьи
Текст статьи
```

  

Подсказка

Класс нужно определить в один из существующих пакетов или создать новый. Подумайте, какой вариант лучше подойдет для этой задачи.

  

## 2. Добавление функциональности поиска

Чтобы была возможность искать и по статьям, и по товарам, нам нужно объединить их по какому-то признаку. Общий родительский класс тут не очень подходит, поэтому для реализации поиска понадобится интерфейс, который будет реализовывать статьи и товары.

1. Создайте интерфейс 
    
    ```
    Searchable
    ```
    
    , который будет иметь три метода:

- Метод получения search term (термина поиска) — метод, который будет возвращать текст, по которому мы будем искать.
- Метод получения типа контента, который мы нашли. Метод должен возвращать строку с названием типа контента.
- Метод получения имени 
    
    ```
    Searchable
    ```
    
    -объекта.

> Метод преобразования 
> 
> ```
> Searchable
> ```
> 
> -объекта в строку (он не может называться 
> 
> ```
> toString
> ```
> 
> , так как 
> 
> ```
> toString
> ```
> 
>  мы используем для вывода товаров в корзине) лучше назвать 
> 
> ```
> getStringRepresentation()
> ```
> 
> . Стоит сделать этот метод интерфейса default и добавить реализацию, которая будет выводить строку вида: «имя 
> 
> ```
> Searchable
> ```
> 
> -объекта — тип 
> 
> ```
> Searchable
> ```
> 
> -объекта».

Также не забывайте про правильный пакет.

1. Реализуйте интерфейс 
    
    ```
    Searchable
    ```
    
    в классах товаров и статей. Для этого:

- В классе товаров нужно имплементировать интерфейс 
    
    ```
    Searchable
    ```
    
     в родительском классе товаров и в качестве 
    
    ```
    search term
    ```
    
     — «возвращать имя товара», а в качестве типа — возвращать строку PRODUCT.
- В классе статьи в качестве 
    
    ```
    search term
    ```
    
     нужно вернуть строку, состоящую из названия и текста статьи. Можно просто возвращать строку из 
    
    ```
    toString
    ```
    
    , в качестве типа возвращаем строку ARTICLE.

## 3. Добавление компонента поиска

Теперь у нас есть классы, поддерживающие поиск. Нам нужен класс, который будет искать введенную строку среди наших товаров и статей и показывать максимум 5 подходящих результатов пользователю.

Для этого реализуйте класс 

```
SearchEngine
```

, который состоит из следующих элементов.

1. Поле 
    
    ```
    Searchable[]
    ```
    
     — массив всех элементов, по которым можно искать. Размерность массива нужно передавать через конструктор класса 
    
    ```
    Searchable[]
    ```
    
    .
2. Метод 
    
    ```
    search
    ```
    
     — принимает в себя строку для поиска и возвращает 5 результатов поиска по массиву 
    
    ```
    Searchable
    ```
    
     в виде массива из 5 элементов.
3. Метод 
    
    ```
    add()
    ```
    
     — добавляет новый объект типа 
    
    ```
    Searchable
    ```
    
     в массив поискового движка.

> Обратите внимание! Чтобы реализовать поиск по массиву 
> 
> ```
> Searchable
> ```
> 
> , нужно перебрать весь массив: брать у каждого элемента 
> 
> ```
> SearchTerm
> ```
> 
>  и искать по нему, используя встроенный метод строки 
> 
> ```
> contains
> ```
> 
> . Найденные элементы нужно сразу определять в массив.

Если элементов больше 5, то можно прерывать цикл поиска с помощью ключевого слова 

```
break
```

. Массив результатов может содержать 

```
null
```

-элементы, а также его не нужно сортировать или вставлять элементы специальным образом через индексы, достаточно вернуть 5 первых подходящих объектов 

```
Searchable
```

.

## 3. Тестирование изменений

Теперь нам нужно продемонстрировать и протестировать изменения. Для этого:

- Создайте один объект типа 
    
    ```
    SearchEngine
    ```
    
     и добавьте в него все товары, которые создаются для проверки других методов.
- Создайте несколько объектов типа 
    
    ```
    Article
    ```
    
     и добавьте их в 
    
    ```
    Search Engine
    ```
    
    .
- Продемонстрируйте функциональность поиска с помощью объекта 
    
    ```
    SearchEngine
    ```
    
    : вызовите метод 
    
    ```
    search
    ```
    
     несколько раз с разными строками поиска.

  

Подсказка

Найденные объекты можно выводить с помощью 

```
System.out.println
```

 и статического метода класса 

```
Arrays
```

 → 

```
Arrays.toString(arr)
```

.

Критерии оценки

- Создан новый класс 
    
    ```
    Article
    ```
    
     по требованиям из условий домашки.
- Создан интерфейс 
    
    ```
    Searchable
    ```
    
    .
- Интерфейс 
    
    ```
    Searchable
    ```
    
     реализован в классах 
    
    ```
    Article
    ```
    
     и 
    
    ```
    Product
    ```
    
    .
- Создан новый класс 
    
    ```
    SearchEngine
    ```
    
    , позволяющий выполнять поиск по статьям и продуктам.
- В методе 
    
    ```
    main
    ```
    
     созданы объекты класса 
    
    ```
    Article
    ```
    
    .
- В методе 
    
    ```
    main
    ```
    
     создан объект класса 
    
    ```
    SearchEngine
    ```
    
    .
- В методе 
    
    ```
    main
    ```
    
     объекты 
    
    ```
    Article
    ```
    
     и все потомки класса 
    
    ```
    Product
    ```
    
     добавлены в объект класса 
    
    ```
    SearchEngine
    ```
    
    .
- Методы 
    
    ```
    SearchEngine
    ```
    
     продемонстрированы.
- Результаты, возвращенные 
    
    ```
    SearchEngine
    ```
    
    , выведены на экран.
- Все созданные классы находятся в соответствующих пакетах.
- Код проекта отформатирован.
- Проект компилируется и выполняется, нет ошибок, приводящих к «падению» программы при выполнении.
- Проект не содержит неиспользуемых классов и методов, а также закомментированного кода (но вы можете добавить текстовые комментарии для разъяснения сложных моментов в коде).