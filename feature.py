def calc(first, second, sign):
    """Calculator

    Args:
        first (int): first number
        second (int): second number
        sign (string): operation

    Returns:
        int: result
    """
    if sign == '+':
        return first + second
    elif sign == '-':
        return first - second
    elif sign == '*':
        return first * second
    elif sign == '/':
        return first / second
    elif sign == '//':
        return first // second
    elif sign == '%':
        return first % second
    return "error"

def tests():
    print("=== Test 1 ===")
    print("5 + 3")
    print("true: ", 5 + 3)
    print("answer: ", calc(5, 3, '+'))

    print("=== Test 2 ===")
    print("8 - 2")
    print("true: ", 8 - 2)
    print("answer: ", calc(8, 2, '-'))

    print("=== Test 3 ===")
    print("9 // 4")
    print("true: ", 9 // 4)
    print("answer: ", calc(9, 4, '//'))

tests()