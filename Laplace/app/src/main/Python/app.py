from sympy import *
from sympy.abc import a, t, x, s, X, g, G
def find(f):
 if ")(" in f:
    f = f.replace(")(",")*(")
 laplace = laplace_transform(f,t,s)
 result = laplace[0]
 result = str(result)
 result = result.replace("**","^")
 return result