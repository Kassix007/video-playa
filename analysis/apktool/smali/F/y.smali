.class public final LF/y;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(ILjava/util/ArrayList;)V
    .locals 0

    .line 1
    iput p1, p0, LF/y;->q:I

    iput-object p2, p0, LF/y;->r:Ljava/util/ArrayList;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LF/y;->q:I

    .line 4
    .line 5
    sget-object v2, Lm5/y;->a:Lm5/y;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, v0, LF/y;->r:Ljava/util/ArrayList;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, Lz0/I;

    .line 16
    .line 17
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    :goto_0
    if-ge v3, v5, :cond_0

    .line 22
    .line 23
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    check-cast v6, Lz0/J;

    .line 28
    .line 29
    invoke-static {v1, v6}, Lz0/I;->g(Lz0/I;Lz0/J;)V

    .line 30
    .line 31
    .line 32
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-object v2

    .line 36
    :pswitch_0
    move-object/from16 v1, p1

    .line 37
    .line 38
    check-cast v1, Lz0/I;

    .line 39
    .line 40
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    move v6, v3

    .line 45
    :goto_1
    if-ge v6, v5, :cond_1

    .line 46
    .line 47
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    check-cast v7, Lz0/J;

    .line 52
    .line 53
    invoke-static {v1, v7, v3, v3}, Lz0/I;->d(Lz0/I;Lz0/J;II)V

    .line 54
    .line 55
    .line 56
    add-int/lit8 v6, v6, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    return-object v2

    .line 60
    :pswitch_1
    move-object/from16 v1, p1

    .line 61
    .line 62
    check-cast v1, Lz0/I;

    .line 63
    .line 64
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    move v6, v3

    .line 69
    :goto_2
    if-ge v6, v5, :cond_2

    .line 70
    .line 71
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    check-cast v7, Lz0/J;

    .line 76
    .line 77
    invoke-static {v1, v7, v3, v3}, Lz0/I;->f(Lz0/I;Lz0/J;II)V

    .line 78
    .line 79
    .line 80
    add-int/lit8 v6, v6, 0x1

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_2
    return-object v2

    .line 84
    :pswitch_2
    move-object/from16 v1, p1

    .line 85
    .line 86
    check-cast v1, Lz0/I;

    .line 87
    .line 88
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    move v6, v3

    .line 93
    :goto_3
    if-ge v6, v5, :cond_d

    .line 94
    .line 95
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    check-cast v7, LF/l;

    .line 100
    .line 101
    iget-object v8, v7, LF/l;->b:Ljava/util/List;

    .line 102
    .line 103
    iget-boolean v9, v7, LF/l;->i:Z

    .line 104
    .line 105
    iget v10, v7, LF/l;->m:I

    .line 106
    .line 107
    const/high16 v11, -0x80000000

    .line 108
    .line 109
    if-eq v10, v11, :cond_3

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_3
    const-string v10, "position() should be called first"

    .line 113
    .line 114
    invoke-static {v10}, Lz/a;->a(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    :goto_4
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    move v11, v3

    .line 122
    :goto_5
    if-ge v11, v10, :cond_c

    .line 123
    .line 124
    invoke-interface {v8, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v12

    .line 128
    check-cast v12, Lz0/J;

    .line 129
    .line 130
    iget-object v13, v7, LF/l;->k:[I

    .line 131
    .line 132
    mul-int/lit8 v14, v11, 0x2

    .line 133
    .line 134
    aget v15, v13, v14

    .line 135
    .line 136
    add-int/lit8 v14, v14, 0x1

    .line 137
    .line 138
    aget v13, v13, v14

    .line 139
    .line 140
    int-to-long v14, v15

    .line 141
    const/16 v16, 0x20

    .line 142
    .line 143
    shl-long v14, v14, v16

    .line 144
    .line 145
    move-object/from16 v17, v4

    .line 146
    .line 147
    int-to-long v3, v13

    .line 148
    const-wide v18, 0xffffffffL

    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    and-long v3, v3, v18

    .line 154
    .line 155
    or-long/2addr v3, v14

    .line 156
    iget-boolean v13, v7, LF/l;->h:Z

    .line 157
    .line 158
    if-eqz v13, :cond_8

    .line 159
    .line 160
    if-eqz v9, :cond_4

    .line 161
    .line 162
    shr-long v13, v3, v16

    .line 163
    .line 164
    long-to-int v13, v13

    .line 165
    goto :goto_7

    .line 166
    :cond_4
    shr-long v13, v3, v16

    .line 167
    .line 168
    long-to-int v13, v13

    .line 169
    iget v14, v7, LF/l;->m:I

    .line 170
    .line 171
    sub-int/2addr v14, v13

    .line 172
    if-eqz v9, :cond_5

    .line 173
    .line 174
    iget v13, v12, Lz0/J;->r:I

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_5
    iget v13, v12, Lz0/J;->q:I

    .line 178
    .line 179
    :goto_6
    sub-int v13, v14, v13

    .line 180
    .line 181
    :goto_7
    if-eqz v9, :cond_7

    .line 182
    .line 183
    and-long v3, v3, v18

    .line 184
    .line 185
    long-to-int v3, v3

    .line 186
    iget v4, v7, LF/l;->m:I

    .line 187
    .line 188
    sub-int/2addr v4, v3

    .line 189
    if-eqz v9, :cond_6

    .line 190
    .line 191
    iget v3, v12, Lz0/J;->r:I

    .line 192
    .line 193
    goto :goto_8

    .line 194
    :cond_6
    iget v3, v12, Lz0/J;->q:I

    .line 195
    .line 196
    :goto_8
    sub-int/2addr v4, v3

    .line 197
    goto :goto_9

    .line 198
    :cond_7
    and-long v3, v3, v18

    .line 199
    .line 200
    long-to-int v4, v3

    .line 201
    :goto_9
    int-to-long v13, v13

    .line 202
    shl-long v13, v13, v16

    .line 203
    .line 204
    int-to-long v3, v4

    .line 205
    and-long v3, v3, v18

    .line 206
    .line 207
    or-long/2addr v3, v13

    .line 208
    :cond_8
    iget-wide v13, v7, LF/l;->c:J

    .line 209
    .line 210
    invoke-static {v3, v4, v13, v14}, LW0/i;->c(JJ)J

    .line 211
    .line 212
    .line 213
    move-result-wide v3

    .line 214
    if-eqz v9, :cond_9

    .line 215
    .line 216
    invoke-static {v1, v12, v3, v4}, Lz0/I;->i(Lz0/I;Lz0/J;J)V

    .line 217
    .line 218
    .line 219
    move-object v14, v1

    .line 220
    goto :goto_b

    .line 221
    :cond_9
    sget v13, Lz0/L;->b:I

    .line 222
    .line 223
    sget-object v13, Lz0/K;->r:Lz0/K;

    .line 224
    .line 225
    invoke-virtual {v1}, Lz0/I;->b()LW0/l;

    .line 226
    .line 227
    .line 228
    move-result-object v14

    .line 229
    sget-object v15, LW0/l;->q:LW0/l;

    .line 230
    .line 231
    if-eq v14, v15, :cond_a

    .line 232
    .line 233
    invoke-virtual {v1}, Lz0/I;->c()I

    .line 234
    .line 235
    .line 236
    move-result v14

    .line 237
    if-nez v14, :cond_b

    .line 238
    .line 239
    :cond_a
    move-object v14, v1

    .line 240
    const/4 v15, 0x0

    .line 241
    goto :goto_a

    .line 242
    :cond_b
    invoke-virtual {v1}, Lz0/I;->c()I

    .line 243
    .line 244
    .line 245
    move-result v14

    .line 246
    iget v15, v12, Lz0/J;->q:I

    .line 247
    .line 248
    sub-int/2addr v14, v15

    .line 249
    move-object/from16 p1, v1

    .line 250
    .line 251
    shr-long v0, v3, v16

    .line 252
    .line 253
    long-to-int v0, v0

    .line 254
    sub-int/2addr v14, v0

    .line 255
    and-long v0, v3, v18

    .line 256
    .line 257
    long-to-int v0, v0

    .line 258
    int-to-long v3, v14

    .line 259
    shl-long v3, v3, v16

    .line 260
    .line 261
    int-to-long v0, v0

    .line 262
    and-long v0, v0, v18

    .line 263
    .line 264
    or-long/2addr v0, v3

    .line 265
    move-object/from16 v14, p1

    .line 266
    .line 267
    invoke-static {v14, v12}, Lz0/I;->a(Lz0/I;Lz0/J;)V

    .line 268
    .line 269
    .line 270
    iget-wide v3, v12, Lz0/J;->u:J

    .line 271
    .line 272
    invoke-static {v0, v1, v3, v4}, LW0/i;->c(JJ)J

    .line 273
    .line 274
    .line 275
    move-result-wide v0

    .line 276
    const/4 v15, 0x0

    .line 277
    invoke-virtual {v12, v0, v1, v15, v13}, Lz0/J;->U(JFLB5/c;)V

    .line 278
    .line 279
    .line 280
    goto :goto_b

    .line 281
    :goto_a
    invoke-static {v14, v12}, Lz0/I;->a(Lz0/I;Lz0/J;)V

    .line 282
    .line 283
    .line 284
    iget-wide v0, v12, Lz0/J;->u:J

    .line 285
    .line 286
    invoke-static {v3, v4, v0, v1}, LW0/i;->c(JJ)J

    .line 287
    .line 288
    .line 289
    move-result-wide v0

    .line 290
    invoke-virtual {v12, v0, v1, v15, v13}, Lz0/J;->U(JFLB5/c;)V

    .line 291
    .line 292
    .line 293
    :goto_b
    add-int/lit8 v11, v11, 0x1

    .line 294
    .line 295
    move-object/from16 v0, p0

    .line 296
    .line 297
    move-object v1, v14

    .line 298
    move-object/from16 v4, v17

    .line 299
    .line 300
    const/4 v3, 0x0

    .line 301
    goto/16 :goto_5

    .line 302
    .line 303
    :cond_c
    move-object v14, v1

    .line 304
    move-object/from16 v17, v4

    .line 305
    .line 306
    add-int/lit8 v6, v6, 0x1

    .line 307
    .line 308
    move-object/from16 v0, p0

    .line 309
    .line 310
    const/4 v3, 0x0

    .line 311
    goto/16 :goto_3

    .line 312
    .line 313
    :cond_d
    return-object v2

    .line 314
    nop

    .line 315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
