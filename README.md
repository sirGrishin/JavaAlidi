Для обращения к внешим микросервисам буду использовать FeignClient, не могу сказать что знаю все нюансы его использования, но получилось как-то вот так)

1) если у нас пользователь залогинен, то я бы использовал @AuthenticationPrincipal, чтобы получить данные по нему, и заполнить его адрес
в данном случае я сделаю добавление вручную
2) На счет кэша я не уверен, с ним не работал
3) У нас есть метод расчета цен в другом микрсоервисе, не очень понимаю зачем тогда нам нужно кешировать цены тут, если мы все равно обращаемся во вне
когда расчитваем сумму по позиции

# JavaAlidi
