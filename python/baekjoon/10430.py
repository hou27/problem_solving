# (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?

# (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
A, B, C = map(int, input().split())

print((A + B) % C)
print(((A % C) + (B % C)) % C)
print((A * B) % C)
print(((A % C) * (B % C)) % C)
# if((A + B) % C == ((A % C) + (B % C)) % C):
#   print("1")
# else:
#   print("0")

# if((A + B) % C == ((A % C) + (B % C)) % C):
#   print("1")
# else:
#   print("0")
