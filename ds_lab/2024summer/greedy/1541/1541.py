equation = input()

splited_equation = equation.split("-")
nums = [int(num) for v in splited_equation for num in v.split("+")]

result = nums[0]
idx = 1
flag = False
for value in equation:
    if value == "-":
        flag = True
        break
    elif value == "+":
        result += nums[idx]
        idx += 1
    else:
        pass
for i in range(idx, len(nums)):
    result -= nums[i]

print(result)