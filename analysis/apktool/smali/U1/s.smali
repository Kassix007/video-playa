.class public final synthetic LU1/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LM5/w;Lu/d0;LT1/d;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, LU1/s;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU1/s;->s:Ljava/lang/Object;

    iput-object p2, p0, LU1/s;->t:Ljava/lang/Object;

    iput-object p3, p0, LU1/s;->r:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(LT1/u;LR4/k1;LP/W;)V
    .locals 1

    .line 2
    const/4 v0, 0x3

    iput v0, p0, LU1/s;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU1/s;->r:Ljava/lang/Object;

    iput-object p2, p0, LU1/s;->s:Ljava/lang/Object;

    iput-object p3, p0, LU1/s;->t:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lm5/e;II)V
    .locals 0

    .line 3
    iput p5, p0, LU1/s;->q:I

    iput-object p1, p0, LU1/s;->r:Ljava/lang/Object;

    iput-object p2, p0, LU1/s;->s:Ljava/lang/Object;

    iput-object p3, p0, LU1/s;->t:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, LU1/s;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LU1/s;->r:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, LT1/u;

    .line 10
    .line 11
    iget-object v0, p0, LU1/s;->s:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, LR4/k1;

    .line 14
    .line 15
    iget-object v2, p0, LU1/s;->t:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, LP/W;

    .line 18
    .line 19
    move-object v10, p1

    .line 20
    check-cast v10, LP/o;

    .line 21
    .line 22
    check-cast p2, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    and-int/lit8 p2, p1, 0x3

    .line 29
    .line 30
    const/4 v3, 0x2

    .line 31
    const/4 v4, 0x1

    .line 32
    if-eq p2, v3, :cond_0

    .line 33
    .line 34
    move p2, v4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 p2, 0x0

    .line 37
    :goto_0
    and-int/2addr p1, v4

    .line 38
    invoke-virtual {v10, p1, p2}, LP/o;->K(IZ)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_3

    .line 43
    .line 44
    iget-object p1, v0, LR4/k1;->h:Ljava/lang/String;

    .line 45
    .line 46
    iget-object p2, v0, LR4/k1;->i:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {p1, p2}, LC0/S;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v10, v0}, LP/o;->i(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    if-nez p2, :cond_1

    .line 61
    .line 62
    sget-object p2, LP/k;->a:LP/S;

    .line 63
    .line 64
    if-ne v3, p2, :cond_2

    .line 65
    .line 66
    :cond_1
    new-instance v3, LU4/f;

    .line 67
    .line 68
    const/4 p2, 0x5

    .line 69
    invoke-direct {v3, v0, v2, p2}, LU4/f;-><init>(LR4/k1;LP/W;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v10, v3}, LP/o;->d0(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    move-object v9, v3

    .line 76
    check-cast v9, LB5/c;

    .line 77
    .line 78
    const/4 v11, 0x0

    .line 79
    const/4 v3, 0x0

    .line 80
    const/4 v4, 0x0

    .line 81
    const/4 v5, 0x0

    .line 82
    const/4 v6, 0x0

    .line 83
    const/4 v7, 0x0

    .line 84
    const/4 v8, 0x0

    .line 85
    move-object v2, p1

    .line 86
    invoke-static/range {v1 .. v11}, Ll6/d;->g(LT1/u;Ljava/lang/String;Lc0/m;Lc0/e;LB5/c;LB5/c;LB5/c;LB5/c;LB5/c;LP/o;I)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    invoke-virtual {v10}, LP/o;->N()V

    .line 91
    .line 92
    .line 93
    :goto_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 94
    .line 95
    return-object p1

    .line 96
    :pswitch_0
    iget-object v0, p0, LU1/s;->r:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, LR4/k1;

    .line 99
    .line 100
    iget-object v1, p0, LU1/s;->s:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v1, Le5/b;

    .line 103
    .line 104
    iget-object v2, p0, LU1/s;->t:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v2, LB5/a;

    .line 107
    .line 108
    check-cast p1, LP/o;

    .line 109
    .line 110
    check-cast p2, Ljava/lang/Integer;

    .line 111
    .line 112
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    const/16 p2, 0x181

    .line 116
    .line 117
    invoke-static {p2}, LP/b;->w(I)I

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    invoke-static {v0, v1, v2, p1, p2}, LQ2/g;->f(LR4/k1;Le5/b;LB5/a;LP/o;I)V

    .line 122
    .line 123
    .line 124
    :goto_2
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 125
    .line 126
    return-object p1

    .line 127
    :pswitch_1
    iget-object v0, p0, LU1/s;->s:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, LM5/w;

    .line 130
    .line 131
    iget-object v1, p0, LU1/s;->t:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v1, Lu/d0;

    .line 134
    .line 135
    iget-object v2, p0, LU1/s;->r:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v2, LT1/d;

    .line 138
    .line 139
    check-cast p1, Ljava/lang/Float;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    check-cast p2, Ljava/lang/Float;

    .line 146
    .line 147
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    new-instance p2, LU1/z;

    .line 151
    .line 152
    const/4 v3, 0x0

    .line 153
    invoke-direct {p2, p1, v1, v2, v3}, LU1/z;-><init>(FLu/d0;LT1/d;Lq5/c;)V

    .line 154
    .line 155
    .line 156
    const/4 p1, 0x3

    .line 157
    invoke-static {v0, v3, v3, p2, p1}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :pswitch_2
    iget-object v0, p0, LU1/s;->r:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v0, LT1/d;

    .line 164
    .line 165
    iget-object v1, p0, LU1/s;->s:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v1, LZ/c;

    .line 168
    .line 169
    iget-object v2, p0, LU1/s;->t:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v2, LX/e;

    .line 172
    .line 173
    check-cast p1, LP/o;

    .line 174
    .line 175
    check-cast p2, Ljava/lang/Integer;

    .line 176
    .line 177
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    const/16 p2, 0x181

    .line 181
    .line 182
    invoke-static {p2}, LP/b;->w(I)I

    .line 183
    .line 184
    .line 185
    move-result p2

    .line 186
    invoke-static {v0, v1, v2, p1, p2}, Lcom/google/android/gms/internal/measurement/K1;->a(LT1/d;LZ/c;LX/e;LP/o;I)V

    .line 187
    .line 188
    .line 189
    goto :goto_2

    .line 190
    nop

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
