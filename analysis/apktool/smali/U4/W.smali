.class public final synthetic LU4/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/f;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LR4/k1;


# direct methods
.method public synthetic constructor <init>(LR4/k1;I)V
    .locals 0

    .line 1
    iput p2, p0, LU4/W;->q:I

    iput-object p1, p0, LU4/W;->r:LR4/k1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, LU4/W;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LA/L;

    .line 7
    .line 8
    check-cast p2, LP/o;

    .line 9
    .line 10
    check-cast p3, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    const-string v0, "innerPadding"

    .line 17
    .line 18
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    and-int/lit8 v0, p3, 0x6

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p2, p1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    const/4 p1, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 p1, 0x2

    .line 34
    :goto_0
    or-int/2addr p3, p1

    .line 35
    :cond_1
    and-int/lit8 p1, p3, 0x13

    .line 36
    .line 37
    const/16 v0, 0x12

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    const/4 v2, 0x0

    .line 41
    if-eq p1, v0, :cond_2

    .line 42
    .line 43
    move p1, v1

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move p1, v2

    .line 46
    :goto_1
    and-int/2addr p3, v1

    .line 47
    invoke-virtual {p2, p3, p1}, LP/o;->K(IZ)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_9

    .line 52
    .line 53
    invoke-virtual {p2}, LP/o;->H()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    sget-object p3, LP/k;->a:LP/S;

    .line 58
    .line 59
    if-ne p1, p3, :cond_4

    .line 60
    .line 61
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 62
    .line 63
    const/16 p3, 0x23

    .line 64
    .line 65
    if-lt p1, p3, :cond_3

    .line 66
    .line 67
    sget-object p1, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 68
    .line 69
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    sget-object p1, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 75
    .line 76
    invoke-static {p1, v1}, LU4/a;->A(Lc0/m;Z)Lc0/m;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    :goto_2
    invoke-virtual {p2, p1}, LP/o;->d0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_4
    check-cast p1, LP/W;

    .line 88
    .line 89
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    move-object v3, p1

    .line 94
    check-cast v3, Lc0/m;

    .line 95
    .line 96
    int-to-float v5, v2

    .line 97
    const/4 v6, 0x0

    .line 98
    const/4 v8, 0x5

    .line 99
    const/4 v4, 0x0

    .line 100
    move v7, v5

    .line 101
    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/layout/b;->d(Lc0/m;FFFFI)Lc0/m;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/P1;->l(LP/o;)J

    .line 106
    .line 107
    .line 108
    move-result-wide v3

    .line 109
    sget-object p3, Lj0/B;->a:LO3/D;

    .line 110
    .line 111
    invoke-static {p1, v3, v4, p3}, Landroidx/compose/foundation/a;->a(Lc0/m;JLj0/E;)Lc0/m;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    sget-object p3, Lc0/b;->u:Lc0/e;

    .line 116
    .line 117
    invoke-static {p3, v2}, LA/n;->d(Lc0/e;Z)Lz0/C;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    iget v0, p2, LP/o;->P:I

    .line 122
    .line 123
    invoke-virtual {p2}, LP/o;->m()LP/i0;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-static {p2, p1}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    sget-object v4, LB0/k;->a:LB0/j;

    .line 132
    .line 133
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    sget-object v4, LB0/j;->b:LB0/D;

    .line 137
    .line 138
    invoke-virtual {p2}, LP/o;->W()V

    .line 139
    .line 140
    .line 141
    iget-boolean v5, p2, LP/o;->O:Z

    .line 142
    .line 143
    if-eqz v5, :cond_5

    .line 144
    .line 145
    invoke-virtual {p2, v4}, LP/o;->l(LB5/a;)V

    .line 146
    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_5
    invoke-virtual {p2}, LP/o;->g0()V

    .line 150
    .line 151
    .line 152
    :goto_3
    sget-object v4, LB0/j;->e:LB0/i;

    .line 153
    .line 154
    invoke-static {v4, p2, p3}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    sget-object p3, LB0/j;->d:LB0/i;

    .line 158
    .line 159
    invoke-static {p3, p2, v3}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    sget-object p3, LB0/j;->f:LB0/i;

    .line 163
    .line 164
    iget-boolean v3, p2, LP/o;->O:Z

    .line 165
    .line 166
    if-nez v3, :cond_6

    .line 167
    .line 168
    invoke-virtual {p2}, LP/o;->H()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    invoke-static {v3, v4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    if-nez v3, :cond_7

    .line 181
    .line 182
    :cond_6
    invoke-static {v0, p2, v0, p3}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 183
    .line 184
    .line 185
    :cond_7
    sget-object p3, LB0/j;->c:LB0/i;

    .line 186
    .line 187
    invoke-static {p3, p2, p1}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    iget-object p1, p0, LU4/W;->r:LR4/k1;

    .line 191
    .line 192
    iget-object p3, p1, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 193
    .line 194
    invoke-virtual {p3}, Lh/h;->getResources()Landroid/content/res/Resources;

    .line 195
    .line 196
    .line 197
    move-result-object p3

    .line 198
    iget-object v0, p1, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 199
    .line 200
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    const-string v3, "splashimg"

    .line 205
    .line 206
    const-string v4, "drawable"

    .line 207
    .line 208
    invoke-virtual {p3, v3, v4, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 209
    .line 210
    .line 211
    move-result p3

    .line 212
    if-eqz p3, :cond_8

    .line 213
    .line 214
    const v0, 0x60dff5b5

    .line 215
    .line 216
    .line 217
    invoke-virtual {p2, v0}, LP/o;->S(I)V

    .line 218
    .line 219
    .line 220
    sget-object v0, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 221
    .line 222
    const/16 v3, 0x180

    .line 223
    .line 224
    invoke-static {p1, p3, v0, p2, v3}, LU4/a;->r(LR4/k1;ILc0/m;LP/o;I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p2, v2}, LP/o;->p(Z)V

    .line 228
    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_8
    const p1, -0x456f908d

    .line 232
    .line 233
    .line 234
    invoke-virtual {p2, p1}, LP/o;->S(I)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p2, v2}, LP/o;->p(Z)V

    .line 238
    .line 239
    .line 240
    :goto_4
    invoke-virtual {p2, v1}, LP/o;->p(Z)V

    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_9
    invoke-virtual {p2}, LP/o;->N()V

    .line 245
    .line 246
    .line 247
    :goto_5
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 248
    .line 249
    return-object p1

    .line 250
    :pswitch_0
    check-cast p1, LA/u;

    .line 251
    .line 252
    check-cast p2, LP/o;

    .line 253
    .line 254
    check-cast p3, Ljava/lang/Integer;

    .line 255
    .line 256
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 257
    .line 258
    .line 259
    move-result p3

    .line 260
    const-string v0, "$this$ElevatedCard"

    .line 261
    .line 262
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    and-int/lit8 p1, p3, 0x11

    .line 266
    .line 267
    const/16 v0, 0x10

    .line 268
    .line 269
    const/4 v1, 0x0

    .line 270
    const/4 v2, 0x1

    .line 271
    if-eq p1, v0, :cond_a

    .line 272
    .line 273
    move p1, v2

    .line 274
    goto :goto_6

    .line 275
    :cond_a
    move p1, v1

    .line 276
    :goto_6
    and-int/2addr p3, v2

    .line 277
    invoke-virtual {p2, p3, p1}, LP/o;->K(IZ)Z

    .line 278
    .line 279
    .line 280
    move-result p1

    .line 281
    if-eqz p1, :cond_b

    .line 282
    .line 283
    iget-object p1, p0, LU4/W;->r:LR4/k1;

    .line 284
    .line 285
    invoke-static {p1, p2, v1}, LU4/a;->d(LR4/k1;LP/o;I)V

    .line 286
    .line 287
    .line 288
    goto :goto_7

    .line 289
    :cond_b
    invoke-virtual {p2}, LP/o;->N()V

    .line 290
    .line 291
    .line 292
    :goto_7
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 293
    .line 294
    return-object p1

    .line 295
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
