.class public final LM/m;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# static fields
.field public static final r:LM/m;

.field public static final s:LM/m;

.field public static final t:LM/m;

.field public static final u:LM/m;

.field public static final v:LM/m;

.field public static final w:LM/m;

.field public static final x:LM/m;

.field public static final y:LM/m;

.field public static final z:LM/m;


# instance fields
.field public final synthetic q:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LM/m;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, LM/m;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LM/m;->r:LM/m;

    .line 9
    .line 10
    new-instance v0, LM/m;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v2}, LM/m;-><init>(II)V

    .line 14
    .line 15
    .line 16
    sput-object v0, LM/m;->s:LM/m;

    .line 17
    .line 18
    new-instance v0, LM/m;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-direct {v0, v1, v2}, LM/m;-><init>(II)V

    .line 22
    .line 23
    .line 24
    sput-object v0, LM/m;->t:LM/m;

    .line 25
    .line 26
    new-instance v0, LM/m;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-direct {v0, v1, v2}, LM/m;-><init>(II)V

    .line 30
    .line 31
    .line 32
    sput-object v0, LM/m;->u:LM/m;

    .line 33
    .line 34
    new-instance v0, LM/m;

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    invoke-direct {v0, v1, v2}, LM/m;-><init>(II)V

    .line 38
    .line 39
    .line 40
    sput-object v0, LM/m;->v:LM/m;

    .line 41
    .line 42
    new-instance v0, LM/m;

    .line 43
    .line 44
    const/4 v2, 0x5

    .line 45
    invoke-direct {v0, v1, v2}, LM/m;-><init>(II)V

    .line 46
    .line 47
    .line 48
    sput-object v0, LM/m;->w:LM/m;

    .line 49
    .line 50
    new-instance v0, LM/m;

    .line 51
    .line 52
    const/4 v2, 0x6

    .line 53
    invoke-direct {v0, v1, v2}, LM/m;-><init>(II)V

    .line 54
    .line 55
    .line 56
    sput-object v0, LM/m;->x:LM/m;

    .line 57
    .line 58
    new-instance v0, LM/m;

    .line 59
    .line 60
    const/4 v2, 0x7

    .line 61
    invoke-direct {v0, v1, v2}, LM/m;-><init>(II)V

    .line 62
    .line 63
    .line 64
    sput-object v0, LM/m;->y:LM/m;

    .line 65
    .line 66
    new-instance v0, LM/m;

    .line 67
    .line 68
    const/16 v2, 0x8

    .line 69
    .line 70
    invoke-direct {v0, v1, v2}, LM/m;-><init>(II)V

    .line 71
    .line 72
    .line 73
    sput-object v0, LM/m;->z:LM/m;

    .line 74
    .line 75
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, LM/m;->q:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LM/m;->q:I

    .line 4
    .line 5
    sget-object v2, Lm5/y;->a:Lm5/y;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    check-cast v1, LZ/b;

    .line 14
    .line 15
    move-object/from16 v1, p2

    .line 16
    .line 17
    check-cast v1, LM/I0;

    .line 18
    .line 19
    iget-object v1, v1, LM/I0;->c:LN/r;

    .line 20
    .line 21
    iget-object v1, v1, LN/r;->g:LP/f0;

    .line 22
    .line 23
    invoke-virtual {v1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, LM/J0;

    .line 28
    .line 29
    return-object v1

    .line 30
    :pswitch_0
    move-object/from16 v1, p1

    .line 31
    .line 32
    check-cast v1, LP/o;

    .line 33
    .line 34
    move-object/from16 v2, p2

    .line 35
    .line 36
    check-cast v2, Ljava/lang/Number;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 39
    .line 40
    .line 41
    const v2, 0x37c7584

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, LP/o;->S(I)V

    .line 45
    .line 46
    .line 47
    sget-object v2, LM/c;->a:LM/c;

    .line 48
    .line 49
    sget-object v2, LA/Z;->v:Ljava/util/WeakHashMap;

    .line 50
    .line 51
    invoke-static {v1}, LA/b;->e(LP/o;)LA/Z;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iget-object v2, v2, LA/Z;->k:LA/U;

    .line 56
    .line 57
    new-instance v3, LA/I;

    .line 58
    .line 59
    invoke-direct {v3, v2}, LA/I;-><init>(LA/W;)V

    .line 60
    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    invoke-virtual {v1, v2}, LP/o;->p(Z)V

    .line 64
    .line 65
    .line 66
    return-object v3

    .line 67
    :pswitch_1
    move-object/from16 v1, p1

    .line 68
    .line 69
    check-cast v1, LP/o;

    .line 70
    .line 71
    move-object/from16 v4, p2

    .line 72
    .line 73
    check-cast v4, Ljava/lang/Number;

    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    and-int/lit8 v4, v4, 0x3

    .line 80
    .line 81
    if-ne v4, v3, :cond_1

    .line 82
    .line 83
    invoke-virtual {v1}, LP/o;->x()Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-nez v3, :cond_0

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    invoke-virtual {v1}, LP/o;->N()V

    .line 91
    .line 92
    .line 93
    :cond_1
    :goto_0
    return-object v2

    .line 94
    :pswitch_2
    move-object/from16 v1, p1

    .line 95
    .line 96
    check-cast v1, LP/o;

    .line 97
    .line 98
    move-object/from16 v4, p2

    .line 99
    .line 100
    check-cast v4, Ljava/lang/Number;

    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    and-int/lit8 v4, v4, 0x3

    .line 107
    .line 108
    if-ne v4, v3, :cond_3

    .line 109
    .line 110
    invoke-virtual {v1}, LP/o;->x()Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-nez v3, :cond_2

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_2
    invoke-virtual {v1}, LP/o;->N()V

    .line 118
    .line 119
    .line 120
    :cond_3
    :goto_1
    return-object v2

    .line 121
    :pswitch_3
    move-object/from16 v1, p1

    .line 122
    .line 123
    check-cast v1, LP/o;

    .line 124
    .line 125
    move-object/from16 v4, p2

    .line 126
    .line 127
    check-cast v4, Ljava/lang/Number;

    .line 128
    .line 129
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    and-int/lit8 v4, v4, 0x3

    .line 134
    .line 135
    if-ne v4, v3, :cond_5

    .line 136
    .line 137
    invoke-virtual {v1}, LP/o;->x()Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-nez v3, :cond_4

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_4
    invoke-virtual {v1}, LP/o;->N()V

    .line 145
    .line 146
    .line 147
    :cond_5
    :goto_2
    return-object v2

    .line 148
    :pswitch_4
    move-object/from16 v1, p1

    .line 149
    .line 150
    check-cast v1, LP/o;

    .line 151
    .line 152
    move-object/from16 v4, p2

    .line 153
    .line 154
    check-cast v4, Ljava/lang/Number;

    .line 155
    .line 156
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    and-int/lit8 v4, v4, 0x3

    .line 161
    .line 162
    if-ne v4, v3, :cond_7

    .line 163
    .line 164
    invoke-virtual {v1}, LP/o;->x()Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    if-nez v3, :cond_6

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_6
    invoke-virtual {v1}, LP/o;->N()V

    .line 172
    .line 173
    .line 174
    :cond_7
    :goto_3
    return-object v2

    .line 175
    :pswitch_5
    move-object/from16 v1, p1

    .line 176
    .line 177
    check-cast v1, LP/o;

    .line 178
    .line 179
    move-object/from16 v4, p2

    .line 180
    .line 181
    check-cast v4, Ljava/lang/Number;

    .line 182
    .line 183
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 184
    .line 185
    .line 186
    move-result v4

    .line 187
    and-int/lit8 v4, v4, 0x3

    .line 188
    .line 189
    if-ne v4, v3, :cond_9

    .line 190
    .line 191
    invoke-virtual {v1}, LP/o;->x()Z

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    if-nez v3, :cond_8

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_8
    invoke-virtual {v1}, LP/o;->N()V

    .line 199
    .line 200
    .line 201
    :cond_9
    :goto_4
    return-object v2

    .line 202
    :pswitch_6
    move-object/from16 v11, p1

    .line 203
    .line 204
    check-cast v11, LP/o;

    .line 205
    .line 206
    move-object/from16 v1, p2

    .line 207
    .line 208
    check-cast v1, Ljava/lang/Number;

    .line 209
    .line 210
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    and-int/lit8 v1, v1, 0x3

    .line 215
    .line 216
    if-ne v1, v3, :cond_b

    .line 217
    .line 218
    invoke-virtual {v11}, LP/o;->x()Z

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    if-nez v1, :cond_a

    .line 223
    .line 224
    goto :goto_5

    .line 225
    :cond_a
    invoke-virtual {v11}, LP/o;->N()V

    .line 226
    .line 227
    .line 228
    goto :goto_6

    .line 229
    :cond_b
    :goto_5
    sget-object v4, LM/c;->a:LM/c;

    .line 230
    .line 231
    const-wide/16 v9, 0x0

    .line 232
    .line 233
    const/high16 v12, 0x30000

    .line 234
    .line 235
    const/4 v5, 0x0

    .line 236
    const/4 v6, 0x0

    .line 237
    const/4 v7, 0x0

    .line 238
    const/4 v8, 0x0

    .line 239
    invoke-virtual/range {v4 .. v12}, LM/c;->a(Lc0/m;FFLj0/E;JLP/o;I)V

    .line 240
    .line 241
    .line 242
    :goto_6
    return-object v2

    .line 243
    :pswitch_7
    move-object/from16 v20, p1

    .line 244
    .line 245
    check-cast v20, LP/o;

    .line 246
    .line 247
    move-object/from16 v1, p2

    .line 248
    .line 249
    check-cast v1, Ljava/lang/Number;

    .line 250
    .line 251
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    and-int/lit8 v1, v1, 0x3

    .line 256
    .line 257
    if-ne v1, v3, :cond_d

    .line 258
    .line 259
    invoke-virtual/range {v20 .. v20}, LP/o;->x()Z

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    if-nez v1, :cond_c

    .line 264
    .line 265
    goto :goto_7

    .line 266
    :cond_c
    invoke-virtual/range {v20 .. v20}, LP/o;->N()V

    .line 267
    .line 268
    .line 269
    goto :goto_8

    .line 270
    :cond_d
    :goto_7
    sget-object v13, LM/c;->a:LM/c;

    .line 271
    .line 272
    const-wide/16 v18, 0x0

    .line 273
    .line 274
    const/high16 v21, 0x30000

    .line 275
    .line 276
    const/4 v14, 0x0

    .line 277
    const/4 v15, 0x0

    .line 278
    const/16 v16, 0x0

    .line 279
    .line 280
    const/16 v17, 0x0

    .line 281
    .line 282
    invoke-virtual/range {v13 .. v21}, LM/c;->a(Lc0/m;FFLj0/E;JLP/o;I)V

    .line 283
    .line 284
    .line 285
    :goto_8
    return-object v2

    .line 286
    nop

    .line 287
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
