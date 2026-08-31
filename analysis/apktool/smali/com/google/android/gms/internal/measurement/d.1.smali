.class public final Lcom/google/android/gms/internal/measurement/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lcom/google/android/gms/internal/measurement/n;
.implements Lcom/google/android/gms/internal/measurement/j;


# instance fields
.field public final q:Ljava/util/TreeMap;

.field public final r:Ljava/util/TreeMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->q:Ljava/util/TreeMap;

    new-instance v0, Ljava/util/TreeMap;

    .line 2
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->r:Ljava/util/TreeMap;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/d;-><init>()V

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 4
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 5
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/n;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/measurement/d;->r(ILcom/google/android/gms/internal/measurement/n;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Double;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->q:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :cond_0
    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-gtz v0, :cond_1

    .line 25
    .line 26
    const-wide/16 v0, 0x0

    .line 27
    .line 28
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    :cond_1
    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    .line 34
    .line 35
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0
.end method

.method public final c()Ljava/lang/Boolean;
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Ljava/util/Iterator;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->q:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/d;->r:Ljava/util/TreeMap;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, Lcom/google/android/gms/internal/measurement/c;

    .line 22
    .line 23
    invoke-direct {v2, p0, v0, v1}, Lcom/google/android/gms/internal/measurement/c;-><init>(Lcom/google/android/gms/internal/measurement/d;Ljava/util/Iterator;Ljava/util/Iterator;)V

    .line 24
    .line 25
    .line 26
    return-object v2
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/d;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/measurement/d;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eq v0, v1, :cond_2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->q:Ljava/util/TreeMap;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/d;->q:Ljava/util/TreeMap;

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1

    .line 37
    :cond_3
    invoke-virtual {v0}, Ljava/util/TreeMap;->firstKey()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    :goto_0
    invoke-virtual {v0}, Ljava/util/TreeMap;->lastKey()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Ljava/lang/Integer;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-gt v1, v2, :cond_5

    .line 58
    .line 59
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-nez v2, :cond_4

    .line 72
    .line 73
    :goto_1
    const/4 p1, 0x0

    .line 74
    return p1

    .line 75
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_5
    :goto_2
    const/4 p1, 0x1

    .line 79
    return p1
.end method

.method public final g(Ljava/lang/String;LE/c0;Ljava/util/ArrayList;)Lcom/google/android/gms/internal/measurement/n;
    .locals 29

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    const-string v4, "concat"

    .line 4
    .line 5
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v5

    .line 9
    const-string v6, "unshift"

    .line 10
    .line 11
    const-string v7, "toString"

    .line 12
    .line 13
    const-string v8, "splice"

    .line 14
    .line 15
    const-string v9, "sort"

    .line 16
    .line 17
    const-string v10, "some"

    .line 18
    .line 19
    const-string v11, "slice"

    .line 20
    .line 21
    const-string v12, "shift"

    .line 22
    .line 23
    const-string v13, "reverse"

    .line 24
    .line 25
    const-string v14, "reduceRight"

    .line 26
    .line 27
    const-string v15, "reduce"

    .line 28
    .line 29
    move/from16 v16, v5

    .line 30
    .line 31
    const-string v5, "push"

    .line 32
    .line 33
    move-object/from16 v17, v4

    .line 34
    .line 35
    const-string v4, "pop"

    .line 36
    .line 37
    const-string v0, "map"

    .line 38
    .line 39
    const-string v2, "lastIndexOf"

    .line 40
    .line 41
    const-string v3, "join"

    .line 42
    .line 43
    move-object/from16 v18, v6

    .line 44
    .line 45
    const-string v6, "indexOf"

    .line 46
    .line 47
    move-object/from16 v19, v7

    .line 48
    .line 49
    const-string v7, "forEach"

    .line 50
    .line 51
    move-object/from16 v20, v8

    .line 52
    .line 53
    const-string v8, "filter"

    .line 54
    .line 55
    move-object/from16 v21, v9

    .line 56
    .line 57
    const-string v9, "every"

    .line 58
    .line 59
    if-nez v16, :cond_4

    .line 60
    .line 61
    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v16

    .line 65
    if-nez v16, :cond_4

    .line 66
    .line 67
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v16

    .line 71
    if-nez v16, :cond_4

    .line 72
    .line 73
    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v16

    .line 77
    if-nez v16, :cond_4

    .line 78
    .line 79
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v16

    .line 83
    if-nez v16, :cond_4

    .line 84
    .line 85
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v16

    .line 89
    if-nez v16, :cond_4

    .line 90
    .line 91
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v16

    .line 95
    if-nez v16, :cond_4

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v16

    .line 101
    if-nez v16, :cond_4

    .line 102
    .line 103
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v16

    .line 107
    if-nez v16, :cond_4

    .line 108
    .line 109
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v16

    .line 113
    if-nez v16, :cond_4

    .line 114
    .line 115
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v16

    .line 119
    if-nez v16, :cond_4

    .line 120
    .line 121
    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v16

    .line 125
    if-nez v16, :cond_4

    .line 126
    .line 127
    invoke-virtual {v13, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v16

    .line 131
    if-nez v16, :cond_4

    .line 132
    .line 133
    invoke-virtual {v12, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v16

    .line 137
    if-nez v16, :cond_4

    .line 138
    .line 139
    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v16

    .line 143
    if-nez v16, :cond_4

    .line 144
    .line 145
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v16

    .line 149
    if-nez v16, :cond_4

    .line 150
    .line 151
    move-object/from16 v16, v8

    .line 152
    .line 153
    move-object/from16 v8, v21

    .line 154
    .line 155
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v21

    .line 159
    if-nez v21, :cond_3

    .line 160
    .line 161
    move-object/from16 v21, v15

    .line 162
    .line 163
    move-object/from16 v15, v20

    .line 164
    .line 165
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v20

    .line 169
    if-nez v20, :cond_2

    .line 170
    .line 171
    move-object/from16 v20, v15

    .line 172
    .line 173
    move-object/from16 v15, v19

    .line 174
    .line 175
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v19

    .line 179
    if-nez v19, :cond_1

    .line 180
    .line 181
    move-object/from16 v19, v15

    .line 182
    .line 183
    move-object/from16 v15, v18

    .line 184
    .line 185
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v18

    .line 189
    if-eqz v18, :cond_0

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/measurement/q;

    .line 193
    .line 194
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    move-object/from16 v1, p0

    .line 198
    .line 199
    move-object/from16 v2, p2

    .line 200
    .line 201
    move-object/from16 v3, p3

    .line 202
    .line 203
    invoke-static {v1, v0, v2, v3}, Lcom/google/android/gms/internal/measurement/j;->i(Lcom/google/android/gms/internal/measurement/j;Lcom/google/android/gms/internal/measurement/q;LE/c0;Ljava/util/ArrayList;)Lcom/google/android/gms/internal/measurement/n;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    return-object v0

    .line 208
    :cond_1
    move-object/from16 v19, v15

    .line 209
    .line 210
    :goto_0
    move-object/from16 v15, v18

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_2
    move-object/from16 v20, v15

    .line 214
    .line 215
    goto :goto_0

    .line 216
    :cond_3
    :goto_1
    move-object/from16 v21, v15

    .line 217
    .line 218
    goto :goto_0

    .line 219
    :cond_4
    move-object/from16 v16, v8

    .line 220
    .line 221
    move-object/from16 v8, v21

    .line 222
    .line 223
    goto :goto_1

    .line 224
    :goto_2
    const-wide/high16 v22, -0x4010000000000000L    # -1.0

    .line 225
    .line 226
    move-object/from16 v18, v7

    .line 227
    .line 228
    invoke-static/range {v22 .. v23}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 229
    .line 230
    .line 231
    move-result-object v7

    .line 232
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 233
    .line 234
    .line 235
    move-result v22

    .line 236
    move-object/from16 v23, v7

    .line 237
    .line 238
    const/16 v26, -0x1

    .line 239
    .line 240
    sparse-switch v22, :sswitch_data_0

    .line 241
    .line 242
    .line 243
    :cond_5
    move-object/from16 v14, v16

    .line 244
    .line 245
    move-object/from16 v5, v18

    .line 246
    .line 247
    :cond_6
    :goto_3
    move-object/from16 v15, v19

    .line 248
    .line 249
    goto/16 :goto_7

    .line 250
    .line 251
    :sswitch_0
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    if-eqz v1, :cond_5

    .line 256
    .line 257
    const/4 v1, 0x4

    .line 258
    :goto_4
    move-object/from16 v14, v16

    .line 259
    .line 260
    move-object/from16 v5, v18

    .line 261
    .line 262
    :goto_5
    move-object/from16 v15, v19

    .line 263
    .line 264
    goto/16 :goto_8

    .line 265
    .line 266
    :sswitch_1
    invoke-virtual {v1, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-eqz v1, :cond_5

    .line 271
    .line 272
    const/16 v1, 0xc

    .line 273
    .line 274
    goto :goto_4

    .line 275
    :sswitch_2
    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    if-eqz v1, :cond_5

    .line 280
    .line 281
    const/16 v1, 0xb

    .line 282
    .line 283
    goto :goto_4

    .line 284
    :sswitch_3
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    if-eqz v1, :cond_5

    .line 289
    .line 290
    const/16 v1, 0xe

    .line 291
    .line 292
    goto :goto_4

    .line 293
    :sswitch_4
    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    if-eqz v1, :cond_5

    .line 298
    .line 299
    const/16 v1, 0xd

    .line 300
    .line 301
    goto :goto_4

    .line 302
    :sswitch_5
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    if-eqz v1, :cond_5

    .line 307
    .line 308
    move-object/from16 v14, v16

    .line 309
    .line 310
    move-object/from16 v5, v18

    .line 311
    .line 312
    move-object/from16 v15, v19

    .line 313
    .line 314
    const/4 v1, 0x1

    .line 315
    goto/16 :goto_8

    .line 316
    .line 317
    :sswitch_6
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    if-eqz v1, :cond_5

    .line 322
    .line 323
    const/16 v1, 0x10

    .line 324
    .line 325
    goto :goto_4

    .line 326
    :sswitch_7
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    if-eqz v1, :cond_5

    .line 331
    .line 332
    const/16 v1, 0xf

    .line 333
    .line 334
    goto :goto_4

    .line 335
    :sswitch_8
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    if-eqz v1, :cond_5

    .line 340
    .line 341
    const/16 v1, 0x9

    .line 342
    .line 343
    goto :goto_4

    .line 344
    :sswitch_9
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v1

    .line 348
    if-eqz v1, :cond_5

    .line 349
    .line 350
    const/4 v1, 0x5

    .line 351
    goto :goto_4

    .line 352
    :sswitch_a
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v1

    .line 356
    if-eqz v1, :cond_5

    .line 357
    .line 358
    const/16 v1, 0x8

    .line 359
    .line 360
    goto :goto_4

    .line 361
    :sswitch_b
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v1

    .line 365
    if-eqz v1, :cond_5

    .line 366
    .line 367
    const/4 v1, 0x7

    .line 368
    goto :goto_4

    .line 369
    :sswitch_c
    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v1

    .line 373
    if-eqz v1, :cond_5

    .line 374
    .line 375
    const/16 v1, 0x13

    .line 376
    .line 377
    goto :goto_4

    .line 378
    :sswitch_d
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v1

    .line 382
    if-eqz v1, :cond_5

    .line 383
    .line 384
    const/4 v1, 0x6

    .line 385
    goto :goto_4

    .line 386
    :sswitch_e
    move-object/from16 v5, v18

    .line 387
    .line 388
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    if-eqz v1, :cond_7

    .line 393
    .line 394
    move-object/from16 v14, v16

    .line 395
    .line 396
    move-object/from16 v15, v19

    .line 397
    .line 398
    const/4 v1, 0x3

    .line 399
    goto :goto_8

    .line 400
    :cond_7
    move-object/from16 v14, v16

    .line 401
    .line 402
    goto/16 :goto_3

    .line 403
    .line 404
    :sswitch_f
    move-object/from16 v5, v18

    .line 405
    .line 406
    move-object/from16 v15, v20

    .line 407
    .line 408
    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    if-eqz v1, :cond_7

    .line 413
    .line 414
    const/16 v1, 0x11

    .line 415
    .line 416
    :goto_6
    move-object/from16 v14, v16

    .line 417
    .line 418
    goto/16 :goto_5

    .line 419
    .line 420
    :sswitch_10
    move-object/from16 v5, v18

    .line 421
    .line 422
    move-object/from16 v14, v21

    .line 423
    .line 424
    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move-result v1

    .line 428
    if-eqz v1, :cond_7

    .line 429
    .line 430
    const/16 v1, 0xa

    .line 431
    .line 432
    goto :goto_6

    .line 433
    :sswitch_11
    move-object/from16 v14, v16

    .line 434
    .line 435
    move-object/from16 v5, v18

    .line 436
    .line 437
    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result v1

    .line 441
    if-eqz v1, :cond_6

    .line 442
    .line 443
    move-object/from16 v15, v19

    .line 444
    .line 445
    const/4 v1, 0x2

    .line 446
    goto :goto_8

    .line 447
    :sswitch_12
    move-object/from16 v14, v16

    .line 448
    .line 449
    move-object/from16 v15, v17

    .line 450
    .line 451
    move-object/from16 v5, v18

    .line 452
    .line 453
    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    move-result v1

    .line 457
    if-eqz v1, :cond_6

    .line 458
    .line 459
    move-object/from16 v15, v19

    .line 460
    .line 461
    const/4 v1, 0x0

    .line 462
    goto :goto_8

    .line 463
    :sswitch_13
    move-object/from16 v14, v16

    .line 464
    .line 465
    move-object/from16 v5, v18

    .line 466
    .line 467
    move-object/from16 v15, v19

    .line 468
    .line 469
    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result v1

    .line 473
    if-eqz v1, :cond_8

    .line 474
    .line 475
    const/16 v1, 0x12

    .line 476
    .line 477
    goto :goto_8

    .line 478
    :cond_8
    :goto_7
    move/from16 v1, v26

    .line 479
    .line 480
    :goto_8
    const-string v7, ","

    .line 481
    .line 482
    move/from16 p1, v1

    .line 483
    .line 484
    move-object/from16 v17, v9

    .line 485
    .line 486
    move-object/from16 v1, p0

    .line 487
    .line 488
    iget-object v9, v1, Lcom/google/android/gms/internal/measurement/d;->q:Ljava/util/TreeMap;

    .line 489
    .line 490
    sget-object v18, Lcom/google/android/gms/internal/measurement/n;->d:Lcom/google/android/gms/internal/measurement/r;

    .line 491
    .line 492
    move-object/from16 v19, v14

    .line 493
    .line 494
    const-string v14, "Callback should be a method"

    .line 495
    .line 496
    move-object/from16 v21, v5

    .line 497
    .line 498
    move-object/from16 v20, v6

    .line 499
    .line 500
    const-wide/16 v27, 0x0

    .line 501
    .line 502
    const/4 v5, 0x0

    .line 503
    packed-switch p1, :pswitch_data_0

    .line 504
    .line 505
    .line 506
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 507
    .line 508
    const-string v2, "Command not supported"

    .line 509
    .line 510
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    throw v0

    .line 514
    :pswitch_0
    invoke-virtual/range {p3 .. p3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 515
    .line 516
    .line 517
    move-result v0

    .line 518
    if-nez v0, :cond_c

    .line 519
    .line 520
    new-instance v0, Lcom/google/android/gms/internal/measurement/d;

    .line 521
    .line 522
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/d;-><init>()V

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {p3 .. p3}, Ljava/util/ArrayList;->size()I

    .line 526
    .line 527
    .line 528
    move-result v2

    .line 529
    const/4 v7, 0x0

    .line 530
    :goto_9
    if-ge v7, v2, :cond_a

    .line 531
    .line 532
    move-object/from16 v6, p3

    .line 533
    .line 534
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v3

    .line 538
    add-int/lit8 v7, v7, 0x1

    .line 539
    .line 540
    check-cast v3, Lcom/google/android/gms/internal/measurement/n;

    .line 541
    .line 542
    move-object/from16 v4, p2

    .line 543
    .line 544
    iget-object v5, v4, LE/c0;->r:Ljava/lang/Object;

    .line 545
    .line 546
    check-cast v5, Lcom/google/android/gms/internal/measurement/t;

    .line 547
    .line 548
    invoke-virtual {v5, v4, v3}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 549
    .line 550
    .line 551
    move-result-object v3

    .line 552
    instance-of v5, v3, Lcom/google/android/gms/internal/measurement/f;

    .line 553
    .line 554
    if-nez v5, :cond_9

    .line 555
    .line 556
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 557
    .line 558
    .line 559
    move-result v5

    .line 560
    invoke-virtual {v0, v5, v3}, Lcom/google/android/gms/internal/measurement/d;->r(ILcom/google/android/gms/internal/measurement/n;)V

    .line 561
    .line 562
    .line 563
    goto :goto_9

    .line 564
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 565
    .line 566
    const-string v2, "Argument evaluation failed"

    .line 567
    .line 568
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 569
    .line 570
    .line 571
    throw v0

    .line 572
    :cond_a
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 573
    .line 574
    .line 575
    move-result v2

    .line 576
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->o()Ljava/util/Iterator;

    .line 577
    .line 578
    .line 579
    move-result-object v3

    .line 580
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 581
    .line 582
    .line 583
    move-result v4

    .line 584
    if-eqz v4, :cond_b

    .line 585
    .line 586
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v4

    .line 590
    check-cast v4, Ljava/lang/Integer;

    .line 591
    .line 592
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 593
    .line 594
    .line 595
    move-result v5

    .line 596
    add-int/2addr v5, v2

    .line 597
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 598
    .line 599
    .line 600
    move-result v4

    .line 601
    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 602
    .line 603
    .line 604
    move-result-object v4

    .line 605
    invoke-virtual {v0, v5, v4}, Lcom/google/android/gms/internal/measurement/d;->r(ILcom/google/android/gms/internal/measurement/n;)V

    .line 606
    .line 607
    .line 608
    goto :goto_a

    .line 609
    :cond_b
    invoke-virtual {v9}, Ljava/util/TreeMap;->clear()V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d;->o()Ljava/util/Iterator;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 617
    .line 618
    .line 619
    move-result v3

    .line 620
    if-eqz v3, :cond_c

    .line 621
    .line 622
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v3

    .line 626
    check-cast v3, Ljava/lang/Integer;

    .line 627
    .line 628
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 629
    .line 630
    .line 631
    move-result v4

    .line 632
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 633
    .line 634
    .line 635
    move-result v3

    .line 636
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 637
    .line 638
    .line 639
    move-result-object v3

    .line 640
    invoke-virtual {v1, v4, v3}, Lcom/google/android/gms/internal/measurement/d;->r(ILcom/google/android/gms/internal/measurement/n;)V

    .line 641
    .line 642
    .line 643
    goto :goto_b

    .line 644
    :cond_c
    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    .line 645
    .line 646
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 647
    .line 648
    .line 649
    move-result v2

    .line 650
    int-to-double v2, v2

    .line 651
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 652
    .line 653
    .line 654
    move-result-object v2

    .line 655
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 656
    .line 657
    .line 658
    return-object v0

    .line 659
    :pswitch_1
    move-object/from16 v6, p3

    .line 660
    .line 661
    const/4 v0, 0x0

    .line 662
    invoke-static {v0, v15, v6}, Lcom/google/android/gms/internal/measurement/I1;->I0(ILjava/lang/String;Ljava/util/List;)V

    .line 663
    .line 664
    .line 665
    new-instance v0, Lcom/google/android/gms/internal/measurement/q;

    .line 666
    .line 667
    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/measurement/d;->u(Ljava/lang/String;)Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v2

    .line 671
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    return-object v0

    .line 675
    :pswitch_2
    move-object/from16 v4, p2

    .line 676
    .line 677
    move-object/from16 v6, p3

    .line 678
    .line 679
    const/4 v0, 0x0

    .line 680
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 681
    .line 682
    .line 683
    move-result v2

    .line 684
    if-eqz v2, :cond_d

    .line 685
    .line 686
    new-instance v0, Lcom/google/android/gms/internal/measurement/d;

    .line 687
    .line 688
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/d;-><init>()V

    .line 689
    .line 690
    .line 691
    return-object v0

    .line 692
    :cond_d
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v2

    .line 696
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 697
    .line 698
    iget-object v0, v4, LE/c0;->r:Ljava/lang/Object;

    .line 699
    .line 700
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 701
    .line 702
    iget-object v3, v4, LE/c0;->r:Ljava/lang/Object;

    .line 703
    .line 704
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 705
    .line 706
    invoke-virtual {v0, v4, v2}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 711
    .line 712
    .line 713
    move-result-object v0

    .line 714
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 715
    .line 716
    .line 717
    move-result-wide v7

    .line 718
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/measurement/I1;->P0(D)D

    .line 719
    .line 720
    .line 721
    move-result-wide v7

    .line 722
    double-to-int v0, v7

    .line 723
    if-gez v0, :cond_e

    .line 724
    .line 725
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 726
    .line 727
    .line 728
    move-result v2

    .line 729
    add-int/2addr v2, v0

    .line 730
    const/4 v0, 0x0

    .line 731
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 732
    .line 733
    .line 734
    move-result v2

    .line 735
    move v0, v2

    .line 736
    goto :goto_c

    .line 737
    :cond_e
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 738
    .line 739
    .line 740
    move-result v2

    .line 741
    if-le v0, v2, :cond_f

    .line 742
    .line 743
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 744
    .line 745
    .line 746
    move-result v0

    .line 747
    :cond_f
    :goto_c
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 748
    .line 749
    .line 750
    move-result v2

    .line 751
    new-instance v7, Lcom/google/android/gms/internal/measurement/d;

    .line 752
    .line 753
    invoke-direct {v7}, Lcom/google/android/gms/internal/measurement/d;-><init>()V

    .line 754
    .line 755
    .line 756
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 757
    .line 758
    .line 759
    move-result v8

    .line 760
    const/4 v10, 0x1

    .line 761
    if-le v8, v10, :cond_16

    .line 762
    .line 763
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 764
    .line 765
    .line 766
    move-result-object v5

    .line 767
    check-cast v5, Lcom/google/android/gms/internal/measurement/n;

    .line 768
    .line 769
    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 770
    .line 771
    .line 772
    move-result-object v5

    .line 773
    invoke-interface {v5}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 774
    .line 775
    .line 776
    move-result-object v5

    .line 777
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 778
    .line 779
    .line 780
    move-result-wide v10

    .line 781
    invoke-static {v10, v11}, Lcom/google/android/gms/internal/measurement/I1;->P0(D)D

    .line 782
    .line 783
    .line 784
    move-result-wide v10

    .line 785
    double-to-int v5, v10

    .line 786
    const/4 v8, 0x0

    .line 787
    invoke-static {v8, v5}, Ljava/lang/Math;->max(II)I

    .line 788
    .line 789
    .line 790
    move-result v5

    .line 791
    if-lez v5, :cond_10

    .line 792
    .line 793
    move v8, v0

    .line 794
    :goto_d
    add-int v10, v0, v5

    .line 795
    .line 796
    invoke-static {v2, v10}, Ljava/lang/Math;->min(II)I

    .line 797
    .line 798
    .line 799
    move-result v10

    .line 800
    if-ge v8, v10, :cond_10

    .line 801
    .line 802
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 803
    .line 804
    .line 805
    move-result-object v10

    .line 806
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 807
    .line 808
    .line 809
    move-result v11

    .line 810
    invoke-virtual {v7, v11, v10}, Lcom/google/android/gms/internal/measurement/d;->r(ILcom/google/android/gms/internal/measurement/n;)V

    .line 811
    .line 812
    .line 813
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/d;->t(I)V

    .line 814
    .line 815
    .line 816
    add-int/lit8 v8, v8, 0x1

    .line 817
    .line 818
    goto :goto_d

    .line 819
    :cond_10
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 820
    .line 821
    .line 822
    move-result v2

    .line 823
    const/4 v5, 0x2

    .line 824
    if-le v2, v5, :cond_17

    .line 825
    .line 826
    const/4 v2, 0x2

    .line 827
    :goto_e
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 828
    .line 829
    .line 830
    move-result v5

    .line 831
    if-ge v2, v5, :cond_17

    .line 832
    .line 833
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v5

    .line 837
    check-cast v5, Lcom/google/android/gms/internal/measurement/n;

    .line 838
    .line 839
    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 840
    .line 841
    .line 842
    move-result-object v5

    .line 843
    instance-of v8, v5, Lcom/google/android/gms/internal/measurement/f;

    .line 844
    .line 845
    if-nez v8, :cond_15

    .line 846
    .line 847
    add-int v8, v0, v2

    .line 848
    .line 849
    add-int/lit8 v8, v8, -0x2

    .line 850
    .line 851
    if-ltz v8, :cond_14

    .line 852
    .line 853
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 854
    .line 855
    .line 856
    move-result v10

    .line 857
    if-lt v8, v10, :cond_11

    .line 858
    .line 859
    invoke-virtual {v1, v8, v5}, Lcom/google/android/gms/internal/measurement/d;->r(ILcom/google/android/gms/internal/measurement/n;)V

    .line 860
    .line 861
    .line 862
    goto :goto_10

    .line 863
    :cond_11
    invoke-virtual {v9}, Ljava/util/TreeMap;->lastKey()Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    move-result-object v10

    .line 867
    check-cast v10, Ljava/lang/Integer;

    .line 868
    .line 869
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 870
    .line 871
    .line 872
    move-result v10

    .line 873
    :goto_f
    if-lt v10, v8, :cond_13

    .line 874
    .line 875
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 876
    .line 877
    .line 878
    move-result-object v11

    .line 879
    invoke-virtual {v9, v11}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 880
    .line 881
    .line 882
    move-result-object v12

    .line 883
    check-cast v12, Lcom/google/android/gms/internal/measurement/n;

    .line 884
    .line 885
    if-eqz v12, :cond_12

    .line 886
    .line 887
    add-int/lit8 v13, v10, 0x1

    .line 888
    .line 889
    invoke-virtual {v1, v13, v12}, Lcom/google/android/gms/internal/measurement/d;->r(ILcom/google/android/gms/internal/measurement/n;)V

    .line 890
    .line 891
    .line 892
    invoke-virtual {v9, v11}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 893
    .line 894
    .line 895
    :cond_12
    add-int/lit8 v10, v10, -0x1

    .line 896
    .line 897
    goto :goto_f

    .line 898
    :cond_13
    invoke-virtual {v1, v8, v5}, Lcom/google/android/gms/internal/measurement/d;->r(ILcom/google/android/gms/internal/measurement/n;)V

    .line 899
    .line 900
    .line 901
    :goto_10
    add-int/lit8 v2, v2, 0x1

    .line 902
    .line 903
    goto :goto_e

    .line 904
    :cond_14
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 905
    .line 906
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 907
    .line 908
    .line 909
    move-result-object v2

    .line 910
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 911
    .line 912
    .line 913
    move-result v2

    .line 914
    new-instance v3, Ljava/lang/StringBuilder;

    .line 915
    .line 916
    add-int/lit8 v2, v2, 0x15

    .line 917
    .line 918
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 919
    .line 920
    .line 921
    const-string v2, "Invalid value index: "

    .line 922
    .line 923
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 924
    .line 925
    .line 926
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 927
    .line 928
    .line 929
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 930
    .line 931
    .line 932
    move-result-object v2

    .line 933
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 934
    .line 935
    .line 936
    throw v0

    .line 937
    :cond_15
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 938
    .line 939
    const-string v2, "Failed to parse elements to add"

    .line 940
    .line 941
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 942
    .line 943
    .line 944
    throw v0

    .line 945
    :cond_16
    :goto_11
    if-ge v0, v2, :cond_17

    .line 946
    .line 947
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 948
    .line 949
    .line 950
    move-result-object v3

    .line 951
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 952
    .line 953
    .line 954
    move-result v4

    .line 955
    invoke-virtual {v7, v4, v3}, Lcom/google/android/gms/internal/measurement/d;->r(ILcom/google/android/gms/internal/measurement/n;)V

    .line 956
    .line 957
    .line 958
    invoke-virtual {v1, v0, v5}, Lcom/google/android/gms/internal/measurement/d;->r(ILcom/google/android/gms/internal/measurement/n;)V

    .line 959
    .line 960
    .line 961
    add-int/lit8 v0, v0, 0x1

    .line 962
    .line 963
    goto :goto_11

    .line 964
    :cond_17
    return-object v7

    .line 965
    :pswitch_3
    move-object/from16 v4, p2

    .line 966
    .line 967
    move-object/from16 v6, p3

    .line 968
    .line 969
    const/4 v10, 0x1

    .line 970
    invoke-static {v8, v10, v6}, Lcom/google/android/gms/internal/measurement/I1;->K0(Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 971
    .line 972
    .line 973
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 974
    .line 975
    .line 976
    move-result v0

    .line 977
    const/4 v2, 0x2

    .line 978
    if-lt v0, v2, :cond_25

    .line 979
    .line 980
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->m()Ljava/util/List;

    .line 981
    .line 982
    .line 983
    move-result-object v0

    .line 984
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 985
    .line 986
    .line 987
    move-result v2

    .line 988
    if-nez v2, :cond_19

    .line 989
    .line 990
    const/4 v8, 0x0

    .line 991
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 992
    .line 993
    .line 994
    move-result-object v2

    .line 995
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 996
    .line 997
    iget-object v3, v4, LE/c0;->r:Ljava/lang/Object;

    .line 998
    .line 999
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 1000
    .line 1001
    invoke-virtual {v3, v4, v2}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v2

    .line 1005
    instance-of v3, v2, Lcom/google/android/gms/internal/measurement/h;

    .line 1006
    .line 1007
    if-eqz v3, :cond_18

    .line 1008
    .line 1009
    move-object v5, v2

    .line 1010
    check-cast v5, Lcom/google/android/gms/internal/measurement/h;

    .line 1011
    .line 1012
    goto :goto_12

    .line 1013
    :cond_18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1014
    .line 1015
    const-string v2, "Comparator should be a method"

    .line 1016
    .line 1017
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1018
    .line 1019
    .line 1020
    throw v0

    .line 1021
    :cond_19
    :goto_12
    new-instance v2, Lcom/google/android/gms/internal/measurement/u;

    .line 1022
    .line 1023
    invoke-direct {v2, v5, v4}, Lcom/google/android/gms/internal/measurement/u;-><init>(Lcom/google/android/gms/internal/measurement/h;LE/c0;)V

    .line 1024
    .line 1025
    .line 1026
    invoke-static {v0, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1027
    .line 1028
    .line 1029
    invoke-virtual {v9}, Ljava/util/TreeMap;->clear()V

    .line 1030
    .line 1031
    .line 1032
    check-cast v0, Ljava/util/ArrayList;

    .line 1033
    .line 1034
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1035
    .line 1036
    .line 1037
    move-result v2

    .line 1038
    const/4 v3, 0x0

    .line 1039
    const/4 v7, 0x0

    .line 1040
    :goto_13
    if-ge v3, v2, :cond_25

    .line 1041
    .line 1042
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v4

    .line 1046
    add-int/lit8 v3, v3, 0x1

    .line 1047
    .line 1048
    check-cast v4, Lcom/google/android/gms/internal/measurement/n;

    .line 1049
    .line 1050
    add-int/lit8 v5, v7, 0x1

    .line 1051
    .line 1052
    invoke-virtual {v1, v7, v4}, Lcom/google/android/gms/internal/measurement/d;->r(ILcom/google/android/gms/internal/measurement/n;)V

    .line 1053
    .line 1054
    .line 1055
    move v7, v5

    .line 1056
    goto :goto_13

    .line 1057
    :pswitch_4
    move-object/from16 v4, p2

    .line 1058
    .line 1059
    move-object/from16 v6, p3

    .line 1060
    .line 1061
    const/4 v0, 0x1

    .line 1062
    invoke-static {v0, v10, v6}, Lcom/google/android/gms/internal/measurement/I1;->I0(ILjava/lang/String;Ljava/util/List;)V

    .line 1063
    .line 1064
    .line 1065
    const/4 v0, 0x0

    .line 1066
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v2

    .line 1070
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 1071
    .line 1072
    iget-object v0, v4, LE/c0;->r:Ljava/lang/Object;

    .line 1073
    .line 1074
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 1075
    .line 1076
    invoke-virtual {v0, v4, v2}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v0

    .line 1080
    instance-of v2, v0, Lcom/google/android/gms/internal/measurement/h;

    .line 1081
    .line 1082
    if-eqz v2, :cond_1c

    .line 1083
    .line 1084
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1085
    .line 1086
    .line 1087
    move-result v2

    .line 1088
    if-nez v2, :cond_1a

    .line 1089
    .line 1090
    goto/16 :goto_22

    .line 1091
    .line 1092
    :cond_1a
    check-cast v0, Lcom/google/android/gms/internal/measurement/h;

    .line 1093
    .line 1094
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->o()Ljava/util/Iterator;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v2

    .line 1098
    :cond_1b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1099
    .line 1100
    .line 1101
    move-result v3

    .line 1102
    if-eqz v3, :cond_41

    .line 1103
    .line 1104
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v3

    .line 1108
    check-cast v3, Ljava/lang/Integer;

    .line 1109
    .line 1110
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1111
    .line 1112
    .line 1113
    move-result v3

    .line 1114
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/measurement/d;->s(I)Z

    .line 1115
    .line 1116
    .line 1117
    move-result v5

    .line 1118
    if-eqz v5, :cond_1b

    .line 1119
    .line 1120
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v5

    .line 1124
    int-to-double v6, v3

    .line 1125
    new-instance v3, Lcom/google/android/gms/internal/measurement/g;

    .line 1126
    .line 1127
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v6

    .line 1131
    invoke-direct {v3, v6}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1132
    .line 1133
    .line 1134
    const/4 v6, 0x3

    .line 1135
    new-array v7, v6, [Lcom/google/android/gms/internal/measurement/n;

    .line 1136
    .line 1137
    const/16 v16, 0x0

    .line 1138
    .line 1139
    aput-object v5, v7, v16

    .line 1140
    .line 1141
    const/16 v25, 0x1

    .line 1142
    .line 1143
    aput-object v3, v7, v25

    .line 1144
    .line 1145
    const/16 v24, 0x2

    .line 1146
    .line 1147
    aput-object v1, v7, v24

    .line 1148
    .line 1149
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v3

    .line 1153
    invoke-virtual {v0, v4, v3}, Lcom/google/android/gms/internal/measurement/h;->a(LE/c0;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/n;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v3

    .line 1157
    invoke-interface {v3}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/Boolean;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v3

    .line 1161
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1162
    .line 1163
    .line 1164
    move-result v3

    .line 1165
    if-eqz v3, :cond_1b

    .line 1166
    .line 1167
    goto/16 :goto_23

    .line 1168
    .line 1169
    :cond_1c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1170
    .line 1171
    invoke-direct {v0, v14}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1172
    .line 1173
    .line 1174
    throw v0

    .line 1175
    :pswitch_5
    move-object/from16 v4, p2

    .line 1176
    .line 1177
    move-object/from16 v6, p3

    .line 1178
    .line 1179
    const/4 v2, 0x2

    .line 1180
    invoke-static {v11, v2, v6}, Lcom/google/android/gms/internal/measurement/I1;->K0(Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 1181
    .line 1182
    .line 1183
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1184
    .line 1185
    .line 1186
    move-result v0

    .line 1187
    if-eqz v0, :cond_1d

    .line 1188
    .line 1189
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->l()Lcom/google/android/gms/internal/measurement/n;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v0

    .line 1193
    return-object v0

    .line 1194
    :cond_1d
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1195
    .line 1196
    .line 1197
    move-result v0

    .line 1198
    int-to-double v2, v0

    .line 1199
    const/4 v0, 0x0

    .line 1200
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v0

    .line 1204
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 1205
    .line 1206
    iget-object v5, v4, LE/c0;->r:Ljava/lang/Object;

    .line 1207
    .line 1208
    check-cast v5, Lcom/google/android/gms/internal/measurement/t;

    .line 1209
    .line 1210
    invoke-virtual {v5, v4, v0}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v0

    .line 1214
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v0

    .line 1218
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 1219
    .line 1220
    .line 1221
    move-result-wide v7

    .line 1222
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/measurement/I1;->P0(D)D

    .line 1223
    .line 1224
    .line 1225
    move-result-wide v7

    .line 1226
    cmpg-double v0, v7, v27

    .line 1227
    .line 1228
    if-gez v0, :cond_1e

    .line 1229
    .line 1230
    add-double/2addr v7, v2

    .line 1231
    move-wide/from16 v9, v27

    .line 1232
    .line 1233
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(DD)D

    .line 1234
    .line 1235
    .line 1236
    move-result-wide v7

    .line 1237
    goto :goto_14

    .line 1238
    :cond_1e
    invoke-static {v7, v8, v2, v3}, Ljava/lang/Math;->min(DD)D

    .line 1239
    .line 1240
    .line 1241
    move-result-wide v7

    .line 1242
    :goto_14
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1243
    .line 1244
    .line 1245
    move-result v0

    .line 1246
    const/4 v5, 0x2

    .line 1247
    if-ne v0, v5, :cond_20

    .line 1248
    .line 1249
    const/4 v10, 0x1

    .line 1250
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v0

    .line 1254
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 1255
    .line 1256
    iget-object v5, v4, LE/c0;->r:Ljava/lang/Object;

    .line 1257
    .line 1258
    check-cast v5, Lcom/google/android/gms/internal/measurement/t;

    .line 1259
    .line 1260
    invoke-virtual {v5, v4, v0}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v0

    .line 1264
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v0

    .line 1268
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 1269
    .line 1270
    .line 1271
    move-result-wide v4

    .line 1272
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/measurement/I1;->P0(D)D

    .line 1273
    .line 1274
    .line 1275
    move-result-wide v4

    .line 1276
    const-wide/16 v9, 0x0

    .line 1277
    .line 1278
    cmpg-double v0, v4, v9

    .line 1279
    .line 1280
    if-gez v0, :cond_1f

    .line 1281
    .line 1282
    add-double/2addr v2, v4

    .line 1283
    invoke-static {v2, v3, v9, v10}, Ljava/lang/Math;->max(DD)D

    .line 1284
    .line 1285
    .line 1286
    move-result-wide v2

    .line 1287
    goto :goto_15

    .line 1288
    :cond_1f
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(DD)D

    .line 1289
    .line 1290
    .line 1291
    move-result-wide v2

    .line 1292
    :cond_20
    :goto_15
    new-instance v0, Lcom/google/android/gms/internal/measurement/d;

    .line 1293
    .line 1294
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/d;-><init>()V

    .line 1295
    .line 1296
    .line 1297
    double-to-int v4, v7

    .line 1298
    :goto_16
    int-to-double v5, v4

    .line 1299
    cmpg-double v5, v5, v2

    .line 1300
    .line 1301
    if-gez v5, :cond_21

    .line 1302
    .line 1303
    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v5

    .line 1307
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1308
    .line 1309
    .line 1310
    move-result v6

    .line 1311
    invoke-virtual {v0, v6, v5}, Lcom/google/android/gms/internal/measurement/d;->r(ILcom/google/android/gms/internal/measurement/n;)V

    .line 1312
    .line 1313
    .line 1314
    add-int/lit8 v4, v4, 0x1

    .line 1315
    .line 1316
    goto :goto_16

    .line 1317
    :cond_21
    return-object v0

    .line 1318
    :pswitch_6
    move-object/from16 v6, p3

    .line 1319
    .line 1320
    const/4 v0, 0x0

    .line 1321
    invoke-static {v0, v12, v6}, Lcom/google/android/gms/internal/measurement/I1;->I0(ILjava/lang/String;Ljava/util/List;)V

    .line 1322
    .line 1323
    .line 1324
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1325
    .line 1326
    .line 1327
    move-result v2

    .line 1328
    if-nez v2, :cond_22

    .line 1329
    .line 1330
    goto/16 :goto_20

    .line 1331
    .line 1332
    :cond_22
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v2

    .line 1336
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/d;->t(I)V

    .line 1337
    .line 1338
    .line 1339
    return-object v2

    .line 1340
    :pswitch_7
    move-object/from16 v6, p3

    .line 1341
    .line 1342
    const/4 v0, 0x0

    .line 1343
    invoke-static {v0, v13, v6}, Lcom/google/android/gms/internal/measurement/I1;->I0(ILjava/lang/String;Ljava/util/List;)V

    .line 1344
    .line 1345
    .line 1346
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1347
    .line 1348
    .line 1349
    move-result v0

    .line 1350
    if-eqz v0, :cond_25

    .line 1351
    .line 1352
    const/4 v7, 0x0

    .line 1353
    :goto_17
    div-int/lit8 v2, v0, 0x2

    .line 1354
    .line 1355
    if-ge v7, v2, :cond_25

    .line 1356
    .line 1357
    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/measurement/d;->s(I)Z

    .line 1358
    .line 1359
    .line 1360
    move-result v2

    .line 1361
    if-eqz v2, :cond_24

    .line 1362
    .line 1363
    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v2

    .line 1367
    invoke-virtual {v1, v7, v5}, Lcom/google/android/gms/internal/measurement/d;->r(ILcom/google/android/gms/internal/measurement/n;)V

    .line 1368
    .line 1369
    .line 1370
    add-int/lit8 v3, v0, -0x1

    .line 1371
    .line 1372
    sub-int/2addr v3, v7

    .line 1373
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/measurement/d;->s(I)Z

    .line 1374
    .line 1375
    .line 1376
    move-result v4

    .line 1377
    if-eqz v4, :cond_23

    .line 1378
    .line 1379
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v4

    .line 1383
    invoke-virtual {v1, v7, v4}, Lcom/google/android/gms/internal/measurement/d;->r(ILcom/google/android/gms/internal/measurement/n;)V

    .line 1384
    .line 1385
    .line 1386
    :cond_23
    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/internal/measurement/d;->r(ILcom/google/android/gms/internal/measurement/n;)V

    .line 1387
    .line 1388
    .line 1389
    :cond_24
    add-int/lit8 v7, v7, 0x1

    .line 1390
    .line 1391
    goto :goto_17

    .line 1392
    :cond_25
    return-object v1

    .line 1393
    :pswitch_8
    move-object/from16 v4, p2

    .line 1394
    .line 1395
    move-object/from16 v6, p3

    .line 1396
    .line 1397
    const/4 v0, 0x0

    .line 1398
    invoke-static {v1, v4, v6, v0}, LQ2/g;->S(Lcom/google/android/gms/internal/measurement/d;LE/c0;Ljava/util/ArrayList;Z)Lcom/google/android/gms/internal/measurement/n;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v0

    .line 1402
    return-object v0

    .line 1403
    :pswitch_9
    move-object/from16 v4, p2

    .line 1404
    .line 1405
    move-object/from16 v6, p3

    .line 1406
    .line 1407
    const/4 v10, 0x1

    .line 1408
    invoke-static {v1, v4, v6, v10}, LQ2/g;->S(Lcom/google/android/gms/internal/measurement/d;LE/c0;Ljava/util/ArrayList;Z)Lcom/google/android/gms/internal/measurement/n;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v0

    .line 1412
    return-object v0

    .line 1413
    :pswitch_a
    move-object/from16 v4, p2

    .line 1414
    .line 1415
    move-object/from16 v6, p3

    .line 1416
    .line 1417
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1418
    .line 1419
    .line 1420
    move-result v0

    .line 1421
    if-nez v0, :cond_26

    .line 1422
    .line 1423
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1424
    .line 1425
    .line 1426
    move-result v0

    .line 1427
    const/4 v7, 0x0

    .line 1428
    :goto_18
    if-ge v7, v0, :cond_26

    .line 1429
    .line 1430
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v2

    .line 1434
    add-int/lit8 v7, v7, 0x1

    .line 1435
    .line 1436
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 1437
    .line 1438
    iget-object v3, v4, LE/c0;->r:Ljava/lang/Object;

    .line 1439
    .line 1440
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 1441
    .line 1442
    invoke-virtual {v3, v4, v2}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v2

    .line 1446
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1447
    .line 1448
    .line 1449
    move-result v3

    .line 1450
    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/internal/measurement/d;->r(ILcom/google/android/gms/internal/measurement/n;)V

    .line 1451
    .line 1452
    .line 1453
    goto :goto_18

    .line 1454
    :cond_26
    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    .line 1455
    .line 1456
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1457
    .line 1458
    .line 1459
    move-result v2

    .line 1460
    int-to-double v2, v2

    .line 1461
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v2

    .line 1465
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1466
    .line 1467
    .line 1468
    return-object v0

    .line 1469
    :pswitch_b
    move-object/from16 v6, p3

    .line 1470
    .line 1471
    const/4 v8, 0x0

    .line 1472
    invoke-static {v8, v4, v6}, Lcom/google/android/gms/internal/measurement/I1;->I0(ILjava/lang/String;Ljava/util/List;)V

    .line 1473
    .line 1474
    .line 1475
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1476
    .line 1477
    .line 1478
    move-result v0

    .line 1479
    if-nez v0, :cond_27

    .line 1480
    .line 1481
    goto/16 :goto_20

    .line 1482
    .line 1483
    :cond_27
    add-int/lit8 v0, v0, -0x1

    .line 1484
    .line 1485
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 1486
    .line 1487
    .line 1488
    move-result-object v2

    .line 1489
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/d;->t(I)V

    .line 1490
    .line 1491
    .line 1492
    return-object v2

    .line 1493
    :pswitch_c
    move-object/from16 v4, p2

    .line 1494
    .line 1495
    move-object/from16 v6, p3

    .line 1496
    .line 1497
    const/4 v8, 0x0

    .line 1498
    const/4 v10, 0x1

    .line 1499
    invoke-static {v10, v0, v6}, Lcom/google/android/gms/internal/measurement/I1;->I0(ILjava/lang/String;Ljava/util/List;)V

    .line 1500
    .line 1501
    .line 1502
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v0

    .line 1506
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 1507
    .line 1508
    iget-object v2, v4, LE/c0;->r:Ljava/lang/Object;

    .line 1509
    .line 1510
    check-cast v2, Lcom/google/android/gms/internal/measurement/t;

    .line 1511
    .line 1512
    invoke-virtual {v2, v4, v0}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v0

    .line 1516
    instance-of v2, v0, Lcom/google/android/gms/internal/measurement/m;

    .line 1517
    .line 1518
    if-eqz v2, :cond_29

    .line 1519
    .line 1520
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1521
    .line 1522
    .line 1523
    move-result v2

    .line 1524
    if-nez v2, :cond_28

    .line 1525
    .line 1526
    new-instance v0, Lcom/google/android/gms/internal/measurement/d;

    .line 1527
    .line 1528
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/d;-><init>()V

    .line 1529
    .line 1530
    .line 1531
    return-object v0

    .line 1532
    :cond_28
    check-cast v0, Lcom/google/android/gms/internal/measurement/m;

    .line 1533
    .line 1534
    invoke-static {v1, v4, v0, v5, v5}, LQ2/g;->T(Lcom/google/android/gms/internal/measurement/d;LE/c0;Lcom/google/android/gms/internal/measurement/m;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/d;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v0

    .line 1538
    return-object v0

    .line 1539
    :cond_29
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1540
    .line 1541
    invoke-direct {v0, v14}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1542
    .line 1543
    .line 1544
    throw v0

    .line 1545
    :pswitch_d
    move-object/from16 v4, p2

    .line 1546
    .line 1547
    move-object/from16 v6, p3

    .line 1548
    .line 1549
    const/4 v5, 0x2

    .line 1550
    invoke-static {v2, v5, v6}, Lcom/google/android/gms/internal/measurement/I1;->K0(Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 1551
    .line 1552
    .line 1553
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1554
    .line 1555
    .line 1556
    move-result v0

    .line 1557
    if-nez v0, :cond_2a

    .line 1558
    .line 1559
    const/4 v0, 0x0

    .line 1560
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v0

    .line 1564
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 1565
    .line 1566
    iget-object v2, v4, LE/c0;->r:Ljava/lang/Object;

    .line 1567
    .line 1568
    check-cast v2, Lcom/google/android/gms/internal/measurement/t;

    .line 1569
    .line 1570
    invoke-virtual {v2, v4, v0}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v18

    .line 1574
    :cond_2a
    move-object/from16 v0, v18

    .line 1575
    .line 1576
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1577
    .line 1578
    .line 1579
    move-result v2

    .line 1580
    add-int/lit8 v2, v2, -0x1

    .line 1581
    .line 1582
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1583
    .line 1584
    .line 1585
    move-result v3

    .line 1586
    const/4 v10, 0x1

    .line 1587
    if-le v3, v10, :cond_2c

    .line 1588
    .line 1589
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v2

    .line 1593
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 1594
    .line 1595
    iget-object v3, v4, LE/c0;->r:Ljava/lang/Object;

    .line 1596
    .line 1597
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 1598
    .line 1599
    invoke-virtual {v3, v4, v2}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v2

    .line 1603
    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 1604
    .line 1605
    .line 1606
    move-result-object v3

    .line 1607
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 1608
    .line 1609
    .line 1610
    move-result-wide v3

    .line 1611
    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    .line 1612
    .line 1613
    .line 1614
    move-result v3

    .line 1615
    if-eqz v3, :cond_2b

    .line 1616
    .line 1617
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1618
    .line 1619
    .line 1620
    move-result v2

    .line 1621
    add-int/lit8 v2, v2, -0x1

    .line 1622
    .line 1623
    int-to-double v2, v2

    .line 1624
    :goto_19
    const-wide/16 v27, 0x0

    .line 1625
    .line 1626
    goto :goto_1a

    .line 1627
    :cond_2b
    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v2

    .line 1631
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 1632
    .line 1633
    .line 1634
    move-result-wide v2

    .line 1635
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/I1;->P0(D)D

    .line 1636
    .line 1637
    .line 1638
    move-result-wide v2

    .line 1639
    goto :goto_19

    .line 1640
    :goto_1a
    cmpg-double v4, v2, v27

    .line 1641
    .line 1642
    if-gez v4, :cond_2d

    .line 1643
    .line 1644
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1645
    .line 1646
    .line 1647
    move-result v4

    .line 1648
    int-to-double v4, v4

    .line 1649
    add-double/2addr v2, v4

    .line 1650
    goto :goto_1b

    .line 1651
    :cond_2c
    const-wide/16 v27, 0x0

    .line 1652
    .line 1653
    int-to-double v2, v2

    .line 1654
    :cond_2d
    :goto_1b
    cmpg-double v4, v2, v27

    .line 1655
    .line 1656
    if-gez v4, :cond_2e

    .line 1657
    .line 1658
    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    .line 1659
    .line 1660
    move-object/from16 v5, v23

    .line 1661
    .line 1662
    invoke-direct {v0, v5}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1663
    .line 1664
    .line 1665
    return-object v0

    .line 1666
    :cond_2e
    move-object/from16 v5, v23

    .line 1667
    .line 1668
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1669
    .line 1670
    .line 1671
    move-result v4

    .line 1672
    int-to-double v6, v4

    .line 1673
    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->min(DD)D

    .line 1674
    .line 1675
    .line 1676
    move-result-wide v2

    .line 1677
    double-to-int v2, v2

    .line 1678
    :goto_1c
    if-ltz v2, :cond_30

    .line 1679
    .line 1680
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/d;->s(I)Z

    .line 1681
    .line 1682
    .line 1683
    move-result v3

    .line 1684
    if-eqz v3, :cond_2f

    .line 1685
    .line 1686
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v3

    .line 1690
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/measurement/I1;->N0(Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Z

    .line 1691
    .line 1692
    .line 1693
    move-result v3

    .line 1694
    if-eqz v3, :cond_2f

    .line 1695
    .line 1696
    int-to-double v2, v2

    .line 1697
    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    .line 1698
    .line 1699
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1700
    .line 1701
    .line 1702
    move-result-object v2

    .line 1703
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1704
    .line 1705
    .line 1706
    return-object v0

    .line 1707
    :cond_2f
    add-int/lit8 v2, v2, -0x1

    .line 1708
    .line 1709
    goto :goto_1c

    .line 1710
    :cond_30
    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    .line 1711
    .line 1712
    invoke-direct {v0, v5}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1713
    .line 1714
    .line 1715
    return-object v0

    .line 1716
    :pswitch_e
    move-object/from16 v4, p2

    .line 1717
    .line 1718
    move-object/from16 v6, p3

    .line 1719
    .line 1720
    const/4 v10, 0x1

    .line 1721
    invoke-static {v3, v10, v6}, Lcom/google/android/gms/internal/measurement/I1;->K0(Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 1722
    .line 1723
    .line 1724
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1725
    .line 1726
    .line 1727
    move-result v0

    .line 1728
    if-nez v0, :cond_31

    .line 1729
    .line 1730
    sget-object v0, Lcom/google/android/gms/internal/measurement/n;->k:Lcom/google/android/gms/internal/measurement/q;

    .line 1731
    .line 1732
    return-object v0

    .line 1733
    :cond_31
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1734
    .line 1735
    .line 1736
    move-result v0

    .line 1737
    if-nez v0, :cond_34

    .line 1738
    .line 1739
    const/4 v0, 0x0

    .line 1740
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1741
    .line 1742
    .line 1743
    move-result-object v0

    .line 1744
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 1745
    .line 1746
    iget-object v2, v4, LE/c0;->r:Ljava/lang/Object;

    .line 1747
    .line 1748
    check-cast v2, Lcom/google/android/gms/internal/measurement/t;

    .line 1749
    .line 1750
    invoke-virtual {v2, v4, v0}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v0

    .line 1754
    instance-of v2, v0, Lcom/google/android/gms/internal/measurement/l;

    .line 1755
    .line 1756
    if-nez v2, :cond_33

    .line 1757
    .line 1758
    instance-of v2, v0, Lcom/google/android/gms/internal/measurement/r;

    .line 1759
    .line 1760
    if-eqz v2, :cond_32

    .line 1761
    .line 1762
    goto :goto_1d

    .line 1763
    :cond_32
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/n;->zzc()Ljava/lang/String;

    .line 1764
    .line 1765
    .line 1766
    move-result-object v7

    .line 1767
    goto :goto_1e

    .line 1768
    :cond_33
    :goto_1d
    const-string v7, ""

    .line 1769
    .line 1770
    :cond_34
    :goto_1e
    new-instance v0, Lcom/google/android/gms/internal/measurement/q;

    .line 1771
    .line 1772
    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/measurement/d;->u(Ljava/lang/String;)Ljava/lang/String;

    .line 1773
    .line 1774
    .line 1775
    move-result-object v2

    .line 1776
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 1777
    .line 1778
    .line 1779
    return-object v0

    .line 1780
    :pswitch_f
    move-object/from16 v4, p2

    .line 1781
    .line 1782
    move-object/from16 v6, p3

    .line 1783
    .line 1784
    move-object/from16 v0, v20

    .line 1785
    .line 1786
    move-object/from16 v5, v23

    .line 1787
    .line 1788
    const/4 v2, 0x2

    .line 1789
    invoke-static {v0, v2, v6}, Lcom/google/android/gms/internal/measurement/I1;->K0(Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 1790
    .line 1791
    .line 1792
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1793
    .line 1794
    .line 1795
    move-result v0

    .line 1796
    if-nez v0, :cond_35

    .line 1797
    .line 1798
    const/4 v0, 0x0

    .line 1799
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1800
    .line 1801
    .line 1802
    move-result-object v0

    .line 1803
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 1804
    .line 1805
    iget-object v2, v4, LE/c0;->r:Ljava/lang/Object;

    .line 1806
    .line 1807
    check-cast v2, Lcom/google/android/gms/internal/measurement/t;

    .line 1808
    .line 1809
    invoke-virtual {v2, v4, v0}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1810
    .line 1811
    .line 1812
    move-result-object v18

    .line 1813
    :cond_35
    move-object/from16 v0, v18

    .line 1814
    .line 1815
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1816
    .line 1817
    .line 1818
    move-result v2

    .line 1819
    const/4 v10, 0x1

    .line 1820
    if-le v2, v10, :cond_37

    .line 1821
    .line 1822
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1823
    .line 1824
    .line 1825
    move-result-object v2

    .line 1826
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 1827
    .line 1828
    iget-object v3, v4, LE/c0;->r:Ljava/lang/Object;

    .line 1829
    .line 1830
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 1831
    .line 1832
    invoke-virtual {v3, v4, v2}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1833
    .line 1834
    .line 1835
    move-result-object v2

    .line 1836
    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v2

    .line 1840
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 1841
    .line 1842
    .line 1843
    move-result-wide v2

    .line 1844
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/I1;->P0(D)D

    .line 1845
    .line 1846
    .line 1847
    move-result-wide v2

    .line 1848
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1849
    .line 1850
    .line 1851
    move-result v4

    .line 1852
    int-to-double v6, v4

    .line 1853
    cmpl-double v4, v2, v6

    .line 1854
    .line 1855
    if-ltz v4, :cond_36

    .line 1856
    .line 1857
    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    .line 1858
    .line 1859
    invoke-direct {v0, v5}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1860
    .line 1861
    .line 1862
    return-object v0

    .line 1863
    :cond_36
    const-wide/16 v27, 0x0

    .line 1864
    .line 1865
    cmpg-double v4, v2, v27

    .line 1866
    .line 1867
    if-gez v4, :cond_38

    .line 1868
    .line 1869
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1870
    .line 1871
    .line 1872
    move-result v4

    .line 1873
    int-to-double v6, v4

    .line 1874
    add-double/2addr v2, v6

    .line 1875
    goto :goto_1f

    .line 1876
    :cond_37
    const-wide/16 v27, 0x0

    .line 1877
    .line 1878
    move-wide/from16 v2, v27

    .line 1879
    .line 1880
    :cond_38
    :goto_1f
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->o()Ljava/util/Iterator;

    .line 1881
    .line 1882
    .line 1883
    move-result-object v4

    .line 1884
    :cond_39
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1885
    .line 1886
    .line 1887
    move-result v6

    .line 1888
    if-eqz v6, :cond_3a

    .line 1889
    .line 1890
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1891
    .line 1892
    .line 1893
    move-result-object v6

    .line 1894
    check-cast v6, Ljava/lang/Integer;

    .line 1895
    .line 1896
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 1897
    .line 1898
    .line 1899
    move-result v6

    .line 1900
    int-to-double v7, v6

    .line 1901
    cmpg-double v9, v7, v2

    .line 1902
    .line 1903
    if-ltz v9, :cond_39

    .line 1904
    .line 1905
    invoke-virtual {v1, v6}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 1906
    .line 1907
    .line 1908
    move-result-object v6

    .line 1909
    invoke-static {v6, v0}, Lcom/google/android/gms/internal/measurement/I1;->N0(Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Z

    .line 1910
    .line 1911
    .line 1912
    move-result v6

    .line 1913
    if-eqz v6, :cond_39

    .line 1914
    .line 1915
    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    .line 1916
    .line 1917
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1918
    .line 1919
    .line 1920
    move-result-object v2

    .line 1921
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1922
    .line 1923
    .line 1924
    return-object v0

    .line 1925
    :cond_3a
    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    .line 1926
    .line 1927
    invoke-direct {v0, v5}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1928
    .line 1929
    .line 1930
    return-object v0

    .line 1931
    :pswitch_10
    move-object/from16 v4, p2

    .line 1932
    .line 1933
    move-object/from16 v6, p3

    .line 1934
    .line 1935
    move-object/from16 v0, v21

    .line 1936
    .line 1937
    const/4 v10, 0x1

    .line 1938
    invoke-static {v10, v0, v6}, Lcom/google/android/gms/internal/measurement/I1;->I0(ILjava/lang/String;Ljava/util/List;)V

    .line 1939
    .line 1940
    .line 1941
    const/4 v0, 0x0

    .line 1942
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1943
    .line 1944
    .line 1945
    move-result-object v0

    .line 1946
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 1947
    .line 1948
    iget-object v2, v4, LE/c0;->r:Ljava/lang/Object;

    .line 1949
    .line 1950
    check-cast v2, Lcom/google/android/gms/internal/measurement/t;

    .line 1951
    .line 1952
    invoke-virtual {v2, v4, v0}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1953
    .line 1954
    .line 1955
    move-result-object v0

    .line 1956
    instance-of v2, v0, Lcom/google/android/gms/internal/measurement/m;

    .line 1957
    .line 1958
    if-eqz v2, :cond_3c

    .line 1959
    .line 1960
    invoke-virtual {v9}, Ljava/util/TreeMap;->size()I

    .line 1961
    .line 1962
    .line 1963
    move-result v2

    .line 1964
    if-nez v2, :cond_3b

    .line 1965
    .line 1966
    :goto_20
    return-object v18

    .line 1967
    :cond_3b
    check-cast v0, Lcom/google/android/gms/internal/measurement/m;

    .line 1968
    .line 1969
    invoke-static {v1, v4, v0, v5, v5}, LQ2/g;->T(Lcom/google/android/gms/internal/measurement/d;LE/c0;Lcom/google/android/gms/internal/measurement/m;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/d;

    .line 1970
    .line 1971
    .line 1972
    return-object v18

    .line 1973
    :cond_3c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1974
    .line 1975
    invoke-direct {v0, v14}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1976
    .line 1977
    .line 1978
    throw v0

    .line 1979
    :pswitch_11
    move-object/from16 v4, p2

    .line 1980
    .line 1981
    move-object/from16 v6, p3

    .line 1982
    .line 1983
    move-object/from16 v0, v19

    .line 1984
    .line 1985
    const/4 v10, 0x1

    .line 1986
    invoke-static {v10, v0, v6}, Lcom/google/android/gms/internal/measurement/I1;->I0(ILjava/lang/String;Ljava/util/List;)V

    .line 1987
    .line 1988
    .line 1989
    const/4 v0, 0x0

    .line 1990
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1991
    .line 1992
    .line 1993
    move-result-object v0

    .line 1994
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 1995
    .line 1996
    iget-object v2, v4, LE/c0;->r:Ljava/lang/Object;

    .line 1997
    .line 1998
    check-cast v2, Lcom/google/android/gms/internal/measurement/t;

    .line 1999
    .line 2000
    invoke-virtual {v2, v4, v0}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2001
    .line 2002
    .line 2003
    move-result-object v0

    .line 2004
    instance-of v2, v0, Lcom/google/android/gms/internal/measurement/m;

    .line 2005
    .line 2006
    if-eqz v2, :cond_3f

    .line 2007
    .line 2008
    invoke-virtual {v9}, Ljava/util/TreeMap;->size()I

    .line 2009
    .line 2010
    .line 2011
    move-result v2

    .line 2012
    if-nez v2, :cond_3d

    .line 2013
    .line 2014
    new-instance v0, Lcom/google/android/gms/internal/measurement/d;

    .line 2015
    .line 2016
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/d;-><init>()V

    .line 2017
    .line 2018
    .line 2019
    return-object v0

    .line 2020
    :cond_3d
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->l()Lcom/google/android/gms/internal/measurement/n;

    .line 2021
    .line 2022
    .line 2023
    move-result-object v2

    .line 2024
    check-cast v2, Lcom/google/android/gms/internal/measurement/d;

    .line 2025
    .line 2026
    check-cast v0, Lcom/google/android/gms/internal/measurement/m;

    .line 2027
    .line 2028
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2029
    .line 2030
    invoke-static {v1, v4, v0, v5, v3}, LQ2/g;->T(Lcom/google/android/gms/internal/measurement/d;LE/c0;Lcom/google/android/gms/internal/measurement/m;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/d;

    .line 2031
    .line 2032
    .line 2033
    move-result-object v0

    .line 2034
    new-instance v3, Lcom/google/android/gms/internal/measurement/d;

    .line 2035
    .line 2036
    invoke-direct {v3}, Lcom/google/android/gms/internal/measurement/d;-><init>()V

    .line 2037
    .line 2038
    .line 2039
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d;->o()Ljava/util/Iterator;

    .line 2040
    .line 2041
    .line 2042
    move-result-object v0

    .line 2043
    :goto_21
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2044
    .line 2045
    .line 2046
    move-result v4

    .line 2047
    if-eqz v4, :cond_3e

    .line 2048
    .line 2049
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2050
    .line 2051
    .line 2052
    move-result-object v4

    .line 2053
    check-cast v4, Ljava/lang/Integer;

    .line 2054
    .line 2055
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 2056
    .line 2057
    .line 2058
    move-result v4

    .line 2059
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 2060
    .line 2061
    .line 2062
    move-result-object v4

    .line 2063
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 2064
    .line 2065
    .line 2066
    move-result v5

    .line 2067
    invoke-virtual {v3, v5, v4}, Lcom/google/android/gms/internal/measurement/d;->r(ILcom/google/android/gms/internal/measurement/n;)V

    .line 2068
    .line 2069
    .line 2070
    goto :goto_21

    .line 2071
    :cond_3e
    return-object v3

    .line 2072
    :cond_3f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2073
    .line 2074
    invoke-direct {v0, v14}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 2075
    .line 2076
    .line 2077
    throw v0

    .line 2078
    :pswitch_12
    move-object/from16 v4, p2

    .line 2079
    .line 2080
    move-object/from16 v6, p3

    .line 2081
    .line 2082
    move-object/from16 v0, v17

    .line 2083
    .line 2084
    const/4 v10, 0x1

    .line 2085
    invoke-static {v10, v0, v6}, Lcom/google/android/gms/internal/measurement/I1;->I0(ILjava/lang/String;Ljava/util/List;)V

    .line 2086
    .line 2087
    .line 2088
    const/4 v0, 0x0

    .line 2089
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2090
    .line 2091
    .line 2092
    move-result-object v0

    .line 2093
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 2094
    .line 2095
    iget-object v2, v4, LE/c0;->r:Ljava/lang/Object;

    .line 2096
    .line 2097
    check-cast v2, Lcom/google/android/gms/internal/measurement/t;

    .line 2098
    .line 2099
    invoke-virtual {v2, v4, v0}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2100
    .line 2101
    .line 2102
    move-result-object v0

    .line 2103
    instance-of v2, v0, Lcom/google/android/gms/internal/measurement/m;

    .line 2104
    .line 2105
    if-eqz v2, :cond_43

    .line 2106
    .line 2107
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 2108
    .line 2109
    .line 2110
    move-result v2

    .line 2111
    if-nez v2, :cond_40

    .line 2112
    .line 2113
    goto :goto_23

    .line 2114
    :cond_40
    check-cast v0, Lcom/google/android/gms/internal/measurement/m;

    .line 2115
    .line 2116
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2117
    .line 2118
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2119
    .line 2120
    invoke-static {v1, v4, v0, v2, v3}, LQ2/g;->T(Lcom/google/android/gms/internal/measurement/d;LE/c0;Lcom/google/android/gms/internal/measurement/m;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/d;

    .line 2121
    .line 2122
    .line 2123
    move-result-object v0

    .line 2124
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 2125
    .line 2126
    .line 2127
    move-result v0

    .line 2128
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 2129
    .line 2130
    .line 2131
    move-result v2

    .line 2132
    if-eq v0, v2, :cond_42

    .line 2133
    .line 2134
    :cond_41
    :goto_22
    sget-object v0, Lcom/google/android/gms/internal/measurement/n;->j:Lcom/google/android/gms/internal/measurement/e;

    .line 2135
    .line 2136
    return-object v0

    .line 2137
    :cond_42
    :goto_23
    sget-object v0, Lcom/google/android/gms/internal/measurement/n;->i:Lcom/google/android/gms/internal/measurement/e;

    .line 2138
    .line 2139
    return-object v0

    .line 2140
    :cond_43
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2141
    .line 2142
    invoke-direct {v0, v14}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 2143
    .line 2144
    .line 2145
    throw v0

    .line 2146
    :pswitch_13
    move-object/from16 v4, p2

    .line 2147
    .line 2148
    move-object/from16 v6, p3

    .line 2149
    .line 2150
    const/4 v0, 0x0

    .line 2151
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->l()Lcom/google/android/gms/internal/measurement/n;

    .line 2152
    .line 2153
    .line 2154
    move-result-object v2

    .line 2155
    check-cast v2, Lcom/google/android/gms/internal/measurement/d;

    .line 2156
    .line 2157
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2158
    .line 2159
    .line 2160
    move-result v3

    .line 2161
    if-nez v3, :cond_47

    .line 2162
    .line 2163
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 2164
    .line 2165
    .line 2166
    move-result v3

    .line 2167
    move v7, v0

    .line 2168
    :cond_44
    :goto_24
    if-ge v7, v3, :cond_47

    .line 2169
    .line 2170
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2171
    .line 2172
    .line 2173
    move-result-object v0

    .line 2174
    add-int/lit8 v7, v7, 0x1

    .line 2175
    .line 2176
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 2177
    .line 2178
    iget-object v5, v4, LE/c0;->r:Ljava/lang/Object;

    .line 2179
    .line 2180
    check-cast v5, Lcom/google/android/gms/internal/measurement/t;

    .line 2181
    .line 2182
    invoke-virtual {v5, v4, v0}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2183
    .line 2184
    .line 2185
    move-result-object v0

    .line 2186
    instance-of v5, v0, Lcom/google/android/gms/internal/measurement/f;

    .line 2187
    .line 2188
    if-nez v5, :cond_46

    .line 2189
    .line 2190
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 2191
    .line 2192
    .line 2193
    move-result v5

    .line 2194
    instance-of v8, v0, Lcom/google/android/gms/internal/measurement/d;

    .line 2195
    .line 2196
    if-eqz v8, :cond_45

    .line 2197
    .line 2198
    check-cast v0, Lcom/google/android/gms/internal/measurement/d;

    .line 2199
    .line 2200
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d;->o()Ljava/util/Iterator;

    .line 2201
    .line 2202
    .line 2203
    move-result-object v8

    .line 2204
    :goto_25
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 2205
    .line 2206
    .line 2207
    move-result v9

    .line 2208
    if-eqz v9, :cond_44

    .line 2209
    .line 2210
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2211
    .line 2212
    .line 2213
    move-result-object v9

    .line 2214
    check-cast v9, Ljava/lang/Integer;

    .line 2215
    .line 2216
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 2217
    .line 2218
    .line 2219
    move-result v10

    .line 2220
    add-int/2addr v10, v5

    .line 2221
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 2222
    .line 2223
    .line 2224
    move-result v9

    .line 2225
    invoke-virtual {v0, v9}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 2226
    .line 2227
    .line 2228
    move-result-object v9

    .line 2229
    invoke-virtual {v2, v10, v9}, Lcom/google/android/gms/internal/measurement/d;->r(ILcom/google/android/gms/internal/measurement/n;)V

    .line 2230
    .line 2231
    .line 2232
    goto :goto_25

    .line 2233
    :cond_45
    invoke-virtual {v2, v5, v0}, Lcom/google/android/gms/internal/measurement/d;->r(ILcom/google/android/gms/internal/measurement/n;)V

    .line 2234
    .line 2235
    .line 2236
    goto :goto_24

    .line 2237
    :cond_46
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2238
    .line 2239
    const-string v2, "Failed evaluation of arguments"

    .line 2240
    .line 2241
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2242
    .line 2243
    .line 2244
    throw v0

    .line 2245
    :cond_47
    return-object v2

    .line 2246
    nop

    .line 2247
    :sswitch_data_0
    .sparse-switch
        -0x69e9ad94 -> :sswitch_13
        -0x50c088ec -> :sswitch_12
        -0x4bf73488 -> :sswitch_11
        -0x37b90a9a -> :sswitch_10
        -0x3565b984 -> :sswitch_f
        -0x28732996 -> :sswitch_e
        -0x1bdda92d -> :sswitch_d
        -0x108c6a77 -> :sswitch_c
        0x1a55c -> :sswitch_b
        0x1b251 -> :sswitch_a
        0x31dd2a -> :sswitch_9
        0x34af1a -> :sswitch_8
        0x35f4f4 -> :sswitch_7
        0x35f59e -> :sswitch_6
        0x5c6731b -> :sswitch_5
        0x6856c82 -> :sswitch_4
        0x6873d92 -> :sswitch_3
        0x398d4c56 -> :sswitch_2
        0x418e52e2 -> :sswitch_1
        0x73d44649 -> :sswitch_0
    .end sparse-switch

    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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

.method public final h(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/n;
    .locals 2

    .line 1
    const-string v0, "length"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance p1, Lcom/google/android/gms/internal/measurement/g;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    int-to-double v0, v0

    .line 16
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/d;->j(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->r:Ljava/util/TreeMap;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_1
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->d:Lcom/google/android/gms/internal/measurement/r;

    .line 42
    .line 43
    return-object p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->q:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/p;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1, p0}, Lcom/google/android/gms/internal/measurement/p;-><init>(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final j(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "length"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->r:Ljava/util/TreeMap;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1

    .line 20
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 21
    return p1
.end method

.method public final k(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/n;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->r:Ljava/util/TreeMap;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {v0, p1, p2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final l()Lcom/google/android/gms/internal/measurement/n;
    .locals 5

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/d;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/d;->q:Ljava/util/TreeMap;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/util/Map$Entry;

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    instance-of v3, v3, Lcom/google/android/gms/internal/measurement/j;

    .line 33
    .line 34
    iget-object v4, v0, Lcom/google/android/gms/internal/measurement/d;->q:Ljava/util/TreeMap;

    .line 35
    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 49
    .line 50
    invoke-virtual {v4, v3, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    check-cast v3, Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 65
    .line 66
    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/n;->l()Lcom/google/android/gms/internal/measurement/n;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v4, v3, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    return-object v0
.end method

.method public final m()Ljava/util/List;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v1, v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-object v0
.end method

.method public final o()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->q:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final p()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->q:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_0
    invoke-virtual {v0}, Ljava/util/TreeMap;->lastKey()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    return v0
.end method

.method public final q(I)Lcom/google/android/gms/internal/measurement/n;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ge p1, v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/d;->s(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->q:Ljava/util/TreeMap;

    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->d:Lcom/google/android/gms/internal/measurement/r;

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    .line 32
    .line 33
    const-string v0, "Attempting to get element outside of current array"

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1
.end method

.method public final r(ILcom/google/android/gms/internal/measurement/n;)V
    .locals 2

    .line 1
    const/16 v0, 0x7ed4

    .line 2
    .line 3
    if-gt p1, v0, :cond_2

    .line 4
    .line 5
    if-ltz p1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->q:Ljava/util/TreeMap;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v0, p1, p2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    .line 28
    .line 29
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    add-int/lit8 v0, v0, 0x15

    .line 40
    .line 41
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 42
    .line 43
    .line 44
    const-string v0, "Out of bounds index: "

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p2

    .line 60
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string p2, "Array too large"

    .line 63
    .line 64
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1
.end method

.method public final s(I)Z
    .locals 3

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->q:Ljava/util/TreeMap;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/TreeMap;->lastKey()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-gt p1, v1, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1

    .line 26
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 27
    .line 28
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x15

    .line 39
    .line 40
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 41
    .line 42
    .line 43
    const-string v1, "Out of bounds index: "

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v0
.end method

.method public final t(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->q:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/TreeMap;->lastKey()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-gt p1, v1, :cond_2

    .line 14
    .line 15
    if-gez p1, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v0, v2}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    if-ne p1, v1, :cond_1

    .line 26
    .line 27
    add-int/lit8 p1, p1, -0x1

    .line 28
    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    if-ltz p1, :cond_2

    .line 40
    .line 41
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->d:Lcom/google/android/gms/internal/measurement/r;

    .line 42
    .line 43
    invoke-virtual {v0, v1, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    :goto_0
    add-int/lit8 p1, p1, 0x1

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/TreeMap;->lastKey()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Ljava/lang/Integer;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-gt p1, v1, :cond_2

    .line 60
    .line 61
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 70
    .line 71
    if-eqz v2, :cond_1

    .line 72
    .line 73
    add-int/lit8 v3, p1, -0x1

    .line 74
    .line 75
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v0, v3, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    :goto_1
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, ","

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/d;->u(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final u(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/d;->q:Ljava/util/TreeMap;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_3

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    move v2, v1

    .line 16
    :goto_0
    if-nez p1, :cond_0

    .line 17
    .line 18
    const-string v3, ""

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    move-object v3, p1

    .line 22
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-ge v2, v4, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    instance-of v3, v4, Lcom/google/android/gms/internal/measurement/r;

    .line 36
    .line 37
    if-nez v3, :cond_1

    .line 38
    .line 39
    instance-of v3, v4, Lcom/google/android/gms/internal/measurement/l;

    .line 40
    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    invoke-interface {v4}, Lcom/google/android/gms/internal/measurement/n;->zzc()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-virtual {v0, v1, p1}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1
.end method

.method public final zzc()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, ","

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/d;->u(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
