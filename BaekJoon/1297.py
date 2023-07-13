D, H, W = map(int,input().split())
r = D/(H**2+W**2)**0.5
w=int(W*r)
h=int(H*r)

print(h,w)

    
