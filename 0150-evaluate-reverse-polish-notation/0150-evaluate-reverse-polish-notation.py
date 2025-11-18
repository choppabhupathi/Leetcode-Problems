class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        
        stack1 = []
        for token in tokens:
            if token not in {'+', '-', '*', '/'}:
                stack1.append(token)
            else:
                b = int(stack1.pop())  
                a = int(stack1.pop())   

                if token == '+':
                    stack1.append(a + b)

                elif token == '-':
                    stack1.append(a - b)

                elif token == '*':
                    stack1.append(a * b)

                elif token == '/':
                    stack1.append(int(a / b))


        return int(stack1[0])