.class public final Landroidx/compose/foundation/lazy/layout/c;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/f;


# instance fields
.field public final synthetic q:LE/K;

.field public final synthetic r:Lc0/m;

.field public final synthetic s:LB5/e;

.field public final synthetic t:LP/W;


# direct methods
.method public constructor <init>(LE/K;Lc0/m;LB5/e;LP/W;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/c;->q:LE/K;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/c;->r:Lc0/m;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/lazy/layout/c;->s:LB5/e;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/foundation/lazy/layout/c;->t:LP/W;

    .line 8
    .line 9
    const/4 p1, 0x3

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p1, LZ/c;

    .line 2
    .line 3
    check-cast p2, LP/o;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, LP/o;->H()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    sget-object v0, LP/k;->a:LP/S;

    .line 15
    .line 16
    if-ne p3, v0, :cond_0

    .line 17
    .line 18
    new-instance p3, LE/u;

    .line 19
    .line 20
    new-instance v1, LC/j;

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    iget-object v3, p0, Landroidx/compose/foundation/lazy/layout/c;->t:LP/W;

    .line 24
    .line 25
    invoke-direct {v1, v3, v2}, LC/j;-><init>(LP/W;I)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p3, p1, v1}, LE/u;-><init>(LZ/c;LC/j;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2, p3}, LP/o;->d0(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    move-object v3, p3

    .line 35
    check-cast v3, LE/u;

    .line 36
    .line 37
    invoke-virtual {p2}, LP/o;->H()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-ne p1, v0, :cond_1

    .line 42
    .line 43
    new-instance p1, Lz0/S;

    .line 44
    .line 45
    new-instance p3, LB0/o;

    .line 46
    .line 47
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v3, p3, LB0/o;->q:Ljava/lang/Object;

    .line 51
    .line 52
    sget-object v1, Lr/L;->a:Lr/B;

    .line 53
    .line 54
    new-instance v1, Lr/B;

    .line 55
    .line 56
    invoke-direct {v1}, Lr/B;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v1, p3, LB0/o;->r:Ljava/lang/Object;

    .line 60
    .line 61
    invoke-direct {p1, p3}, Lz0/S;-><init>(Lz0/U;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2, p1}, LP/o;->d0(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    move-object v4, p1

    .line 68
    check-cast v4, Lz0/S;

    .line 69
    .line 70
    const/4 p1, 0x4

    .line 71
    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/c;->q:LE/K;

    .line 72
    .line 73
    const/4 p3, 0x0

    .line 74
    if-eqz v2, :cond_a

    .line 75
    .line 76
    const v1, 0xc2d16c3

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v1}, LP/o;->S(I)V

    .line 80
    .line 81
    .line 82
    const v1, 0x649383

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, v1}, LP/o;->S(I)V

    .line 86
    .line 87
    .line 88
    sget-object v1, LE/e0;->a:LE/E;

    .line 89
    .line 90
    if-eqz v1, :cond_2

    .line 91
    .line 92
    const v5, 0x485a89af

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, v5}, LP/o;->S(I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2, p3}, LP/o;->p(Z)V

    .line 99
    .line 100
    .line 101
    :goto_0
    move-object v5, v1

    .line 102
    goto :goto_1

    .line 103
    :cond_2
    const v1, 0x485b21a8    # 224390.62f

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2, v1}, LP/o;->S(I)V

    .line 107
    .line 108
    .line 109
    sget-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:LP/T0;

    .line 110
    .line 111
    invoke-virtual {p2, v1}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    check-cast v1, Landroid/view/View;

    .line 116
    .line 117
    invoke-virtual {p2, v1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    invoke-virtual {p2}, LP/o;->H()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    if-nez v5, :cond_3

    .line 126
    .line 127
    if-ne v6, v0, :cond_4

    .line 128
    .line 129
    :cond_3
    new-instance v6, LE/b;

    .line 130
    .line 131
    invoke-direct {v6, v1}, LE/b;-><init>(Landroid/view/View;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, v6}, LP/o;->d0(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :cond_4
    move-object v1, v6

    .line 138
    check-cast v1, LE/b;

    .line 139
    .line 140
    invoke-virtual {p2, p3}, LP/o;->p(Z)V

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :goto_1
    invoke-virtual {p2, p3}, LP/o;->p(Z)V

    .line 145
    .line 146
    .line 147
    filled-new-array {v2, v3, v4, v5}, [Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    invoke-virtual {p2, v2}, LP/o;->g(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    invoke-virtual {p2, v3}, LP/o;->i(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    or-int/2addr v1, v6

    .line 160
    invoke-virtual {p2, v4}, LP/o;->i(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    or-int/2addr v1, v6

    .line 165
    invoke-virtual {p2, v5}, LP/o;->i(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v6

    .line 169
    or-int/2addr v1, v6

    .line 170
    invoke-virtual {p2}, LP/o;->H()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    if-nez v1, :cond_5

    .line 175
    .line 176
    if-ne v6, v0, :cond_6

    .line 177
    .line 178
    :cond_5
    new-instance v1, LE/y;

    .line 179
    .line 180
    const/4 v6, 0x0

    .line 181
    invoke-direct/range {v1 .. v6}, LE/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p2, v1}, LP/o;->d0(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    move-object v6, v1

    .line 188
    :cond_6
    check-cast v6, LB5/c;

    .line 189
    .line 190
    invoke-static {v7, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    array-length v5, v1

    .line 195
    move v7, p3

    .line 196
    move v8, v7

    .line 197
    :goto_2
    if-ge v7, v5, :cond_7

    .line 198
    .line 199
    aget-object v9, v1, v7

    .line 200
    .line 201
    invoke-virtual {p2, v9}, LP/o;->g(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v9

    .line 205
    or-int/2addr v8, v9

    .line 206
    add-int/lit8 v7, v7, 0x1

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_7
    invoke-virtual {p2}, LP/o;->H()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    if-nez v8, :cond_8

    .line 214
    .line 215
    if-ne v1, v0, :cond_9

    .line 216
    .line 217
    :cond_8
    new-instance v1, LP/D;

    .line 218
    .line 219
    invoke-direct {v1, v6}, LP/D;-><init>(LB5/c;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p2, v1}, LP/o;->d0(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    :cond_9
    invoke-virtual {p2, p3}, LP/o;->p(Z)V

    .line 226
    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_a
    const v1, 0xc33a101

    .line 230
    .line 231
    .line 232
    invoke-virtual {p2, v1}, LP/o;->S(I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p2, p3}, LP/o;->p(Z)V

    .line 236
    .line 237
    .line 238
    :goto_3
    sget p3, LE/L;->b:I

    .line 239
    .line 240
    iget-object p3, p0, Landroidx/compose/foundation/lazy/layout/c;->r:Lc0/m;

    .line 241
    .line 242
    if-eqz v2, :cond_c

    .line 243
    .line 244
    new-instance v1, Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;

    .line 245
    .line 246
    invoke-direct {v1, v2}, Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;-><init>(LE/K;)V

    .line 247
    .line 248
    .line 249
    invoke-interface {p3, v1}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    if-nez v1, :cond_b

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :cond_b
    move-object p3, v1

    .line 257
    :cond_c
    :goto_4
    invoke-virtual {p2, v3}, LP/o;->g(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/c;->s:LB5/e;

    .line 262
    .line 263
    invoke-virtual {p2, v2}, LP/o;->g(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    or-int/2addr v1, v5

    .line 268
    invoke-virtual {p2}, LP/o;->H()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    if-nez v1, :cond_d

    .line 273
    .line 274
    if-ne v5, v0, :cond_e

    .line 275
    .line 276
    :cond_d
    new-instance v5, LB0/j0;

    .line 277
    .line 278
    invoke-direct {v5, p1, v3, v2}, LB0/j0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p2, v5}, LP/o;->d0(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    :cond_e
    check-cast v5, LB5/e;

    .line 285
    .line 286
    const/16 p1, 0x8

    .line 287
    .line 288
    invoke-static {v4, p3, v5, p2, p1}, Lz0/O;->b(Lz0/S;Lc0/m;LB5/e;LP/o;I)V

    .line 289
    .line 290
    .line 291
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 292
    .line 293
    return-object p1
.end method
