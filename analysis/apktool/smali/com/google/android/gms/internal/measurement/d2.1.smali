.class public final Lcom/google/android/gms/internal/measurement/d2;
.super Lcom/google/android/gms/internal/measurement/k;
.source "SourceFile"


# instance fields
.field public final r:LB0/G0;


# direct methods
.method public constructor <init>(LB0/G0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/k;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/d2;->r:LB0/G0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/String;LE/c0;Ljava/util/ArrayList;)Lcom/google/android/gms/internal/measurement/n;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const-string v4, "getEventName"

    .line 12
    .line 13
    const/4 v5, 0x3

    .line 14
    const-string v6, "getTimestamp"

    .line 15
    .line 16
    const-string v7, "getParamValue"

    .line 17
    .line 18
    const-string v8, "getParams"

    .line 19
    .line 20
    const-string v10, "setParamValue"

    .line 21
    .line 22
    const/4 v11, 0x4

    .line 23
    const-string v12, "setEventName"

    .line 24
    .line 25
    const/4 v13, 0x2

    .line 26
    const/4 v14, 0x1

    .line 27
    sparse-switch v3, :sswitch_data_0

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :sswitch_0
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    move-object/from16 v15, p0

    .line 38
    .line 39
    move v3, v11

    .line 40
    goto :goto_2

    .line 41
    :sswitch_1
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    const/4 v3, 0x5

    .line 48
    :goto_0
    move-object/from16 v15, p0

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :sswitch_2
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_0

    .line 56
    .line 57
    move-object/from16 v15, p0

    .line 58
    .line 59
    move v3, v13

    .line 60
    goto :goto_2

    .line 61
    :sswitch_3
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_0

    .line 66
    .line 67
    move-object/from16 v15, p0

    .line 68
    .line 69
    move v3, v14

    .line 70
    goto :goto_2

    .line 71
    :sswitch_4
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_0

    .line 76
    .line 77
    move-object/from16 v15, p0

    .line 78
    .line 79
    move v3, v5

    .line 80
    goto :goto_2

    .line 81
    :sswitch_5
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_0

    .line 86
    .line 87
    const/4 v3, 0x0

    .line 88
    goto :goto_0

    .line 89
    :cond_0
    :goto_1
    const/4 v3, -0x1

    .line 90
    goto :goto_0

    .line 91
    :goto_2
    iget-object v9, v15, Lcom/google/android/gms/internal/measurement/d2;->r:LB0/G0;

    .line 92
    .line 93
    if-eqz v3, :cond_a

    .line 94
    .line 95
    if-eq v3, v14, :cond_8

    .line 96
    .line 97
    if-eq v3, v13, :cond_6

    .line 98
    .line 99
    if-eq v3, v5, :cond_5

    .line 100
    .line 101
    if-eq v3, v11, :cond_3

    .line 102
    .line 103
    const/4 v4, 0x5

    .line 104
    if-eq v3, v4, :cond_1

    .line 105
    .line 106
    invoke-super/range {p0 .. p3}, Lcom/google/android/gms/internal/measurement/k;->g(Ljava/lang/String;LE/c0;Ljava/util/ArrayList;)Lcom/google/android/gms/internal/measurement/n;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    return-object v0

    .line 111
    :cond_1
    invoke-static {v13, v10, v2}, Lcom/google/android/gms/internal/measurement/I1;->I0(ILjava/lang/String;Ljava/util/List;)V

    .line 112
    .line 113
    .line 114
    const/4 v0, 0x0

    .line 115
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 120
    .line 121
    iget-object v3, v1, LE/c0;->r:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 124
    .line 125
    invoke-virtual {v3, v1, v0}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/n;->zzc()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 138
    .line 139
    iget-object v3, v1, LE/c0;->r:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 142
    .line 143
    invoke-virtual {v3, v1, v2}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    iget-object v2, v9, LB0/G0;->s:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v2, Lcom/google/android/gms/internal/measurement/b;

    .line 150
    .line 151
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/I1;->Q0(Lcom/google/android/gms/internal/measurement/n;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/b;->c:Ljava/util/HashMap;

    .line 156
    .line 157
    if-nez v3, :cond_2

    .line 158
    .line 159
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    return-object v1

    .line 163
    :cond_2
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-static {v4, v3, v0}, Lcom/google/android/gms/internal/measurement/b;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    return-object v1

    .line 175
    :cond_3
    invoke-static {v14, v12, v2}, Lcom/google/android/gms/internal/measurement/I1;->I0(ILjava/lang/String;Ljava/util/List;)V

    .line 176
    .line 177
    .line 178
    const/4 v0, 0x0

    .line 179
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 184
    .line 185
    iget-object v2, v1, LE/c0;->r:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v2, Lcom/google/android/gms/internal/measurement/t;

    .line 188
    .line 189
    invoke-virtual {v2, v1, v0}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    sget-object v1, Lcom/google/android/gms/internal/measurement/n;->d:Lcom/google/android/gms/internal/measurement/r;

    .line 194
    .line 195
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/r;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-nez v1, :cond_4

    .line 200
    .line 201
    sget-object v1, Lcom/google/android/gms/internal/measurement/n;->e:Lcom/google/android/gms/internal/measurement/l;

    .line 202
    .line 203
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/l;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-nez v1, :cond_4

    .line 208
    .line 209
    iget-object v1, v9, LB0/G0;->s:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v1, Lcom/google/android/gms/internal/measurement/b;

    .line 212
    .line 213
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/n;->zzc()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    iput-object v2, v1, Lcom/google/android/gms/internal/measurement/b;->a:Ljava/lang/String;

    .line 218
    .line 219
    new-instance v1, Lcom/google/android/gms/internal/measurement/q;

    .line 220
    .line 221
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/n;->zzc()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    return-object v1

    .line 229
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 230
    .line 231
    const-string v1, "Illegal event name"

    .line 232
    .line 233
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    throw v0

    .line 237
    :cond_5
    const/4 v0, 0x0

    .line 238
    invoke-static {v0, v6, v2}, Lcom/google/android/gms/internal/measurement/I1;->I0(ILjava/lang/String;Ljava/util/List;)V

    .line 239
    .line 240
    .line 241
    iget-object v0, v9, LB0/G0;->s:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v0, Lcom/google/android/gms/internal/measurement/b;

    .line 244
    .line 245
    new-instance v1, Lcom/google/android/gms/internal/measurement/g;

    .line 246
    .line 247
    iget-wide v2, v0, Lcom/google/android/gms/internal/measurement/b;->b:J

    .line 248
    .line 249
    long-to-double v2, v2

    .line 250
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 255
    .line 256
    .line 257
    return-object v1

    .line 258
    :cond_6
    const/4 v0, 0x0

    .line 259
    invoke-static {v0, v8, v2}, Lcom/google/android/gms/internal/measurement/I1;->I0(ILjava/lang/String;Ljava/util/List;)V

    .line 260
    .line 261
    .line 262
    iget-object v0, v9, LB0/G0;->s:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v0, Lcom/google/android/gms/internal/measurement/b;

    .line 265
    .line 266
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/b;->c:Ljava/util/HashMap;

    .line 267
    .line 268
    new-instance v1, Lcom/google/android/gms/internal/measurement/k;

    .line 269
    .line 270
    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/k;-><init>()V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 282
    .line 283
    .line 284
    move-result v3

    .line 285
    if-eqz v3, :cond_7

    .line 286
    .line 287
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    check-cast v3, Ljava/lang/String;

    .line 292
    .line 293
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    invoke-static {v4}, Lcom/google/android/gms/internal/measurement/K1;->O(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/n;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    invoke-virtual {v1, v3, v4}, Lcom/google/android/gms/internal/measurement/k;->k(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/n;)V

    .line 302
    .line 303
    .line 304
    goto :goto_3

    .line 305
    :cond_7
    return-object v1

    .line 306
    :cond_8
    invoke-static {v14, v7, v2}, Lcom/google/android/gms/internal/measurement/I1;->I0(ILjava/lang/String;Ljava/util/List;)V

    .line 307
    .line 308
    .line 309
    const/4 v0, 0x0

    .line 310
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 315
    .line 316
    iget-object v2, v1, LE/c0;->r:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v2, Lcom/google/android/gms/internal/measurement/t;

    .line 319
    .line 320
    invoke-virtual {v2, v1, v0}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/n;->zzc()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    iget-object v1, v9, LB0/G0;->s:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v1, Lcom/google/android/gms/internal/measurement/b;

    .line 331
    .line 332
    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/b;->c:Ljava/util/HashMap;

    .line 333
    .line 334
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    move-result v2

    .line 338
    if-eqz v2, :cond_9

    .line 339
    .line 340
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    goto :goto_4

    .line 345
    :cond_9
    const/4 v0, 0x0

    .line 346
    :goto_4
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/K1;->O(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/n;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    return-object v0

    .line 351
    :cond_a
    const/4 v0, 0x0

    .line 352
    invoke-static {v0, v4, v2}, Lcom/google/android/gms/internal/measurement/I1;->I0(ILjava/lang/String;Ljava/util/List;)V

    .line 353
    .line 354
    .line 355
    iget-object v0, v9, LB0/G0;->s:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v0, Lcom/google/android/gms/internal/measurement/b;

    .line 358
    .line 359
    new-instance v1, Lcom/google/android/gms/internal/measurement/q;

    .line 360
    .line 361
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/b;->a:Ljava/lang/String;

    .line 362
    .line 363
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    return-object v1

    .line 367
    :sswitch_data_0
    .sparse-switch
        0x149f58f -> :sswitch_5
        0x2b69a60 -> :sswitch_4
        0x8bc90da -> :sswitch_3
        0x29c21c7c -> :sswitch_2
        0x36e0dee6 -> :sswitch_1
        0x5d9db603 -> :sswitch_0
    .end sparse-switch
.end method
