.class public final Lu/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/x;


# instance fields
.field public final q:F

.field public final r:F

.field public final s:F

.field public final t:F

.field public final u:F


# direct methods
.method public constructor <init>(FFF)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput v1, v0, Lu/t;->q:F

    .line 13
    .line 14
    iput v2, v0, Lu/t;->r:F

    .line 15
    .line 16
    iput v3, v0, Lu/t;->s:F

    .line 17
    .line 18
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/high16 v5, 0x3f800000    # 1.0f

    .line 23
    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-nez v4, :cond_0

    .line 31
    .line 32
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-nez v4, :cond_0

    .line 37
    .line 38
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-nez v4, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v6, "Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: "

    .line 48
    .line 49
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", "

    .line 56
    .line 57
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v1, ", 1.0."

    .line 70
    .line 71
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {v1}, Lu/P;->a(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    const/4 v1, 0x5

    .line 82
    new-array v1, v1, [F

    .line 83
    .line 84
    const/4 v3, 0x0

    .line 85
    sub-float v4, v2, v3

    .line 86
    .line 87
    const/high16 v6, 0x40400000    # 3.0f

    .line 88
    .line 89
    mul-float/2addr v4, v6

    .line 90
    sub-float v7, v5, v2

    .line 91
    .line 92
    mul-float/2addr v7, v6

    .line 93
    float-to-double v8, v4

    .line 94
    float-to-double v10, v7

    .line 95
    float-to-double v12, v3

    .line 96
    const-wide/high16 v14, 0x4000000000000000L    # 2.0

    .line 97
    .line 98
    mul-double v16, v10, v14

    .line 99
    .line 100
    sub-double v18, v8, v16

    .line 101
    .line 102
    add-double v18, v18, v12

    .line 103
    .line 104
    const-wide/16 v20, 0x0

    .line 105
    .line 106
    cmpg-double v20, v18, v20

    .line 107
    .line 108
    move/from16 p1, v6

    .line 109
    .line 110
    const/4 v6, 0x0

    .line 111
    if-nez v20, :cond_2

    .line 112
    .line 113
    cmpg-double v8, v10, v12

    .line 114
    .line 115
    if-nez v8, :cond_1

    .line 116
    .line 117
    move v8, v6

    .line 118
    goto :goto_1

    .line 119
    :cond_1
    sub-double v8, v16, v12

    .line 120
    .line 121
    mul-double/2addr v12, v14

    .line 122
    sub-double v16, v16, v12

    .line 123
    .line 124
    div-double v8, v8, v16

    .line 125
    .line 126
    double-to-float v8, v8

    .line 127
    invoke-static {v8, v1, v6}, Lj0/B;->z(F[FI)I

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    goto :goto_1

    .line 132
    :cond_2
    mul-double v14, v10, v10

    .line 133
    .line 134
    mul-double/2addr v12, v8

    .line 135
    sub-double/2addr v14, v12

    .line 136
    invoke-static {v14, v15}, Ljava/lang/Math;->sqrt(D)D

    .line 137
    .line 138
    .line 139
    move-result-wide v12

    .line 140
    neg-double v12, v12

    .line 141
    neg-double v8, v8

    .line 142
    add-double/2addr v8, v10

    .line 143
    add-double v10, v12, v8

    .line 144
    .line 145
    neg-double v10, v10

    .line 146
    div-double v10, v10, v18

    .line 147
    .line 148
    double-to-float v10, v10

    .line 149
    invoke-static {v10, v1, v6}, Lj0/B;->z(F[FI)I

    .line 150
    .line 151
    .line 152
    move-result v10

    .line 153
    sub-double/2addr v12, v8

    .line 154
    div-double v12, v12, v18

    .line 155
    .line 156
    double-to-float v8, v12

    .line 157
    invoke-static {v8, v1, v10}, Lj0/B;->z(F[FI)I

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    add-int/2addr v8, v10

    .line 162
    const/4 v9, 0x1

    .line 163
    if-le v8, v9, :cond_4

    .line 164
    .line 165
    aget v10, v1, v6

    .line 166
    .line 167
    aget v11, v1, v9

    .line 168
    .line 169
    cmpl-float v12, v10, v11

    .line 170
    .line 171
    if-lez v12, :cond_3

    .line 172
    .line 173
    aput v11, v1, v6

    .line 174
    .line 175
    aput v10, v1, v9

    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_3
    cmpg-float v9, v10, v11

    .line 179
    .line 180
    if-nez v9, :cond_4

    .line 181
    .line 182
    add-int/lit8 v8, v8, -0x1

    .line 183
    .line 184
    :cond_4
    :goto_1
    sub-float v9, v7, v4

    .line 185
    .line 186
    const/high16 v10, 0x40000000    # 2.0f

    .line 187
    .line 188
    mul-float/2addr v9, v10

    .line 189
    sub-float v7, v3, v7

    .line 190
    .line 191
    mul-float/2addr v7, v10

    .line 192
    neg-float v11, v9

    .line 193
    sub-float/2addr v7, v9

    .line 194
    div-float/2addr v11, v7

    .line 195
    invoke-static {v11, v1, v8}, Lj0/B;->z(F[FI)I

    .line 196
    .line 197
    .line 198
    move-result v7

    .line 199
    add-int/2addr v7, v8

    .line 200
    invoke-static {v3, v5}, Ljava/lang/Math;->min(FF)F

    .line 201
    .line 202
    .line 203
    move-result v8

    .line 204
    invoke-static {v3, v5}, Ljava/lang/Math;->max(FF)F

    .line 205
    .line 206
    .line 207
    move-result v9

    .line 208
    :goto_2
    if-ge v6, v7, :cond_5

    .line 209
    .line 210
    aget v11, v1, v6

    .line 211
    .line 212
    sub-float v12, v2, v5

    .line 213
    .line 214
    mul-float v12, v12, p1

    .line 215
    .line 216
    add-float/2addr v12, v5

    .line 217
    sub-float/2addr v12, v3

    .line 218
    mul-float v13, v2, v10

    .line 219
    .line 220
    sub-float v13, v5, v13

    .line 221
    .line 222
    add-float/2addr v13, v3

    .line 223
    mul-float v13, v13, p1

    .line 224
    .line 225
    mul-float/2addr v12, v11

    .line 226
    add-float/2addr v12, v13

    .line 227
    mul-float/2addr v12, v11

    .line 228
    add-float/2addr v12, v4

    .line 229
    mul-float/2addr v12, v11

    .line 230
    add-float/2addr v12, v3

    .line 231
    invoke-static {v8, v12}, Ljava/lang/Math;->min(FF)F

    .line 232
    .line 233
    .line 234
    move-result v8

    .line 235
    invoke-static {v9, v12}, Ljava/lang/Math;->max(FF)F

    .line 236
    .line 237
    .line 238
    move-result v9

    .line 239
    add-int/lit8 v6, v6, 0x1

    .line 240
    .line 241
    goto :goto_2

    .line 242
    :cond_5
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    int-to-long v1, v1

    .line 247
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    int-to-long v3, v3

    .line 252
    const/16 v5, 0x20

    .line 253
    .line 254
    shl-long/2addr v1, v5

    .line 255
    const-wide v6, 0xffffffffL

    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    and-long/2addr v3, v6

    .line 261
    or-long/2addr v1, v3

    .line 262
    shr-long v3, v1, v5

    .line 263
    .line 264
    long-to-int v3, v3

    .line 265
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    iput v3, v0, Lu/t;->t:F

    .line 270
    .line 271
    and-long/2addr v1, v6

    .line 272
    long-to-int v1, v1

    .line 273
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    iput v1, v0, Lu/t;->u:F

    .line 278
    .line 279
    return-void
.end method


# virtual methods
.method public final c(F)F
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    cmpl-float v3, v1, v2

    .line 7
    .line 8
    if-lez v3, :cond_25

    .line 9
    .line 10
    const/high16 v3, 0x3f800000    # 1.0f

    .line 11
    .line 12
    cmpg-float v4, v1, v3

    .line 13
    .line 14
    if-gez v4, :cond_25

    .line 15
    .line 16
    const/high16 v4, 0x34000000

    .line 17
    .line 18
    invoke-static {v1, v4}, Ljava/lang/Math;->max(FF)F

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    sub-float v5, v2, v4

    .line 23
    .line 24
    iget v6, v0, Lu/t;->q:F

    .line 25
    .line 26
    sub-float v7, v6, v4

    .line 27
    .line 28
    iget v8, v0, Lu/t;->s:F

    .line 29
    .line 30
    sub-float v9, v8, v4

    .line 31
    .line 32
    sub-float v4, v3, v4

    .line 33
    .line 34
    float-to-double v10, v5

    .line 35
    float-to-double v12, v7

    .line 36
    const-wide/high16 v14, 0x4000000000000000L    # 2.0

    .line 37
    .line 38
    mul-double/2addr v12, v14

    .line 39
    sub-double v12, v10, v12

    .line 40
    .line 41
    move/from16 v16, v2

    .line 42
    .line 43
    move/from16 v17, v3

    .line 44
    .line 45
    float-to-double v2, v9

    .line 46
    add-double/2addr v12, v2

    .line 47
    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    .line 48
    .line 49
    mul-double/2addr v12, v2

    .line 50
    move-wide/from16 v18, v2

    .line 51
    .line 52
    sub-float v2, v7, v5

    .line 53
    .line 54
    float-to-double v2, v2

    .line 55
    mul-double v2, v2, v18

    .line 56
    .line 57
    neg-float v5, v5

    .line 58
    move-wide/from16 v20, v14

    .line 59
    .line 60
    float-to-double v14, v5

    .line 61
    sub-float/2addr v7, v9

    .line 62
    move-wide/from16 v22, v12

    .line 63
    .line 64
    float-to-double v12, v7

    .line 65
    mul-double v12, v12, v18

    .line 66
    .line 67
    add-double/2addr v12, v14

    .line 68
    float-to-double v4, v4

    .line 69
    add-double/2addr v12, v4

    .line 70
    const-wide/16 v4, 0x0

    .line 71
    .line 72
    sub-double v14, v12, v4

    .line 73
    .line 74
    invoke-static {v14, v15}, Ljava/lang/Math;->abs(D)D

    .line 75
    .line 76
    .line 77
    move-result-wide v14

    .line 78
    const-wide v24, 0x3e7ad7f29abcaf48L    # 1.0E-7

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    cmpg-double v7, v14, v24

    .line 84
    .line 85
    const/high16 v9, 0x40000000    # 2.0f

    .line 86
    .line 87
    const v14, 0x358cedba    # 1.05E-6f

    .line 88
    .line 89
    .line 90
    const/high16 v15, 0x7fc00000    # Float.NaN

    .line 91
    .line 92
    if-gez v7, :cond_b

    .line 93
    .line 94
    sub-double v12, v22, v4

    .line 95
    .line 96
    invoke-static {v12, v13}, Ljava/lang/Math;->abs(D)D

    .line 97
    .line 98
    .line 99
    move-result-wide v12

    .line 100
    cmpg-double v7, v12, v24

    .line 101
    .line 102
    if-gez v7, :cond_4

    .line 103
    .line 104
    sub-double v4, v2, v4

    .line 105
    .line 106
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    .line 107
    .line 108
    .line 109
    move-result-wide v4

    .line 110
    cmpg-double v4, v4, v24

    .line 111
    .line 112
    if-gez v4, :cond_0

    .line 113
    .line 114
    goto/16 :goto_a

    .line 115
    .line 116
    :cond_0
    neg-double v4, v10

    .line 117
    div-double/2addr v4, v2

    .line 118
    double-to-float v2, v4

    .line 119
    cmpg-float v3, v2, v16

    .line 120
    .line 121
    if-gez v3, :cond_1

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_1
    move/from16 v16, v2

    .line 125
    .line 126
    :goto_0
    cmpl-float v3, v16, v17

    .line 127
    .line 128
    if-lez v3, :cond_2

    .line 129
    .line 130
    move/from16 v16, v17

    .line 131
    .line 132
    :cond_2
    sub-float v2, v16, v2

    .line 133
    .line 134
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    cmpl-float v2, v2, v14

    .line 139
    .line 140
    if-lez v2, :cond_3

    .line 141
    .line 142
    goto/16 :goto_a

    .line 143
    .line 144
    :cond_3
    move/from16 v15, v16

    .line 145
    .line 146
    goto/16 :goto_a

    .line 147
    .line 148
    :cond_4
    mul-double v4, v2, v2

    .line 149
    .line 150
    const-wide/high16 v12, 0x4010000000000000L    # 4.0

    .line 151
    .line 152
    mul-double v12, v12, v22

    .line 153
    .line 154
    mul-double/2addr v12, v10

    .line 155
    sub-double/2addr v4, v12

    .line 156
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    .line 157
    .line 158
    .line 159
    move-result-wide v4

    .line 160
    mul-double v12, v22, v20

    .line 161
    .line 162
    sub-double v10, v4, v2

    .line 163
    .line 164
    div-double/2addr v10, v12

    .line 165
    double-to-float v7, v10

    .line 166
    cmpg-float v10, v7, v16

    .line 167
    .line 168
    if-gez v10, :cond_5

    .line 169
    .line 170
    move/from16 v10, v16

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_5
    move v10, v7

    .line 174
    :goto_1
    cmpl-float v11, v10, v17

    .line 175
    .line 176
    if-lez v11, :cond_6

    .line 177
    .line 178
    move/from16 v10, v17

    .line 179
    .line 180
    :cond_6
    sub-float v7, v10, v7

    .line 181
    .line 182
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 183
    .line 184
    .line 185
    move-result v7

    .line 186
    cmpl-float v7, v7, v14

    .line 187
    .line 188
    if-lez v7, :cond_7

    .line 189
    .line 190
    move v10, v15

    .line 191
    :cond_7
    invoke-static {v10}, Ljava/lang/Float;->isNaN(F)Z

    .line 192
    .line 193
    .line 194
    move-result v7

    .line 195
    if-nez v7, :cond_8

    .line 196
    .line 197
    move v15, v10

    .line 198
    goto/16 :goto_a

    .line 199
    .line 200
    :cond_8
    neg-double v2, v2

    .line 201
    sub-double/2addr v2, v4

    .line 202
    div-double/2addr v2, v12

    .line 203
    double-to-float v2, v2

    .line 204
    cmpg-float v3, v2, v16

    .line 205
    .line 206
    if-gez v3, :cond_9

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_9
    move/from16 v16, v2

    .line 210
    .line 211
    :goto_2
    cmpl-float v3, v16, v17

    .line 212
    .line 213
    if-lez v3, :cond_a

    .line 214
    .line 215
    move/from16 v16, v17

    .line 216
    .line 217
    :cond_a
    sub-float v2, v16, v2

    .line 218
    .line 219
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    cmpl-float v2, v2, v14

    .line 224
    .line 225
    if-lez v2, :cond_3

    .line 226
    .line 227
    goto/16 :goto_a

    .line 228
    .line 229
    :cond_b
    div-double v22, v22, v12

    .line 230
    .line 231
    div-double/2addr v2, v12

    .line 232
    div-double/2addr v10, v12

    .line 233
    mul-double v12, v2, v18

    .line 234
    .line 235
    mul-double v24, v22, v22

    .line 236
    .line 237
    sub-double v12, v12, v24

    .line 238
    .line 239
    const-wide/high16 v24, 0x4022000000000000L    # 9.0

    .line 240
    .line 241
    div-double v12, v12, v24

    .line 242
    .line 243
    mul-double v20, v20, v22

    .line 244
    .line 245
    mul-double v20, v20, v22

    .line 246
    .line 247
    mul-double v20, v20, v22

    .line 248
    .line 249
    mul-double v24, v24, v22

    .line 250
    .line 251
    mul-double v24, v24, v2

    .line 252
    .line 253
    sub-double v20, v20, v24

    .line 254
    .line 255
    const-wide/high16 v2, 0x403b000000000000L    # 27.0

    .line 256
    .line 257
    mul-double/2addr v10, v2

    .line 258
    add-double v10, v10, v20

    .line 259
    .line 260
    const-wide/high16 v2, 0x404b000000000000L    # 54.0

    .line 261
    .line 262
    div-double/2addr v10, v2

    .line 263
    mul-double v2, v10, v10

    .line 264
    .line 265
    mul-double v20, v12, v12

    .line 266
    .line 267
    mul-double v12, v12, v20

    .line 268
    .line 269
    add-double/2addr v2, v12

    .line 270
    move-wide/from16 v20, v4

    .line 271
    .line 272
    div-double v4, v22, v18

    .line 273
    .line 274
    cmpg-double v7, v2, v20

    .line 275
    .line 276
    if-gez v7, :cond_18

    .line 277
    .line 278
    neg-double v2, v12

    .line 279
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 280
    .line 281
    .line 282
    move-result-wide v2

    .line 283
    neg-double v10, v10

    .line 284
    div-double/2addr v10, v2

    .line 285
    const-wide/high16 v12, -0x4010000000000000L    # -1.0

    .line 286
    .line 287
    cmpg-double v7, v10, v12

    .line 288
    .line 289
    if-gez v7, :cond_c

    .line 290
    .line 291
    move-wide v10, v12

    .line 292
    :cond_c
    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    .line 293
    .line 294
    cmpl-double v7, v10, v12

    .line 295
    .line 296
    if-lez v7, :cond_d

    .line 297
    .line 298
    move-wide v10, v12

    .line 299
    :cond_d
    invoke-static {v10, v11}, Ljava/lang/Math;->acos(D)D

    .line 300
    .line 301
    .line 302
    move-result-wide v10

    .line 303
    double-to-float v2, v2

    .line 304
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/P1;->z(F)F

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    mul-float/2addr v2, v9

    .line 309
    float-to-double v2, v2

    .line 310
    div-double v12, v10, v18

    .line 311
    .line 312
    invoke-static {v12, v13}, Ljava/lang/Math;->cos(D)D

    .line 313
    .line 314
    .line 315
    move-result-wide v12

    .line 316
    mul-double/2addr v12, v2

    .line 317
    sub-double/2addr v12, v4

    .line 318
    double-to-float v7, v12

    .line 319
    cmpg-float v12, v7, v16

    .line 320
    .line 321
    if-gez v12, :cond_e

    .line 322
    .line 323
    move/from16 v12, v16

    .line 324
    .line 325
    goto :goto_3

    .line 326
    :cond_e
    move v12, v7

    .line 327
    :goto_3
    cmpl-float v13, v12, v17

    .line 328
    .line 329
    if-lez v13, :cond_f

    .line 330
    .line 331
    move/from16 v12, v17

    .line 332
    .line 333
    :cond_f
    sub-float v7, v12, v7

    .line 334
    .line 335
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 336
    .line 337
    .line 338
    move-result v7

    .line 339
    cmpl-float v7, v7, v14

    .line 340
    .line 341
    if-lez v7, :cond_10

    .line 342
    .line 343
    move v12, v15

    .line 344
    :cond_10
    invoke-static {v12}, Ljava/lang/Float;->isNaN(F)Z

    .line 345
    .line 346
    .line 347
    move-result v7

    .line 348
    if-nez v7, :cond_11

    .line 349
    .line 350
    :goto_4
    move v15, v12

    .line 351
    goto/16 :goto_a

    .line 352
    .line 353
    :cond_11
    const-wide v12, 0x401921fb54442d18L    # 6.283185307179586

    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    add-double/2addr v12, v10

    .line 359
    div-double v12, v12, v18

    .line 360
    .line 361
    invoke-static {v12, v13}, Ljava/lang/Math;->cos(D)D

    .line 362
    .line 363
    .line 364
    move-result-wide v12

    .line 365
    mul-double/2addr v12, v2

    .line 366
    sub-double/2addr v12, v4

    .line 367
    double-to-float v7, v12

    .line 368
    cmpg-float v12, v7, v16

    .line 369
    .line 370
    if-gez v12, :cond_12

    .line 371
    .line 372
    move/from16 v12, v16

    .line 373
    .line 374
    goto :goto_5

    .line 375
    :cond_12
    move v12, v7

    .line 376
    :goto_5
    cmpl-float v13, v12, v17

    .line 377
    .line 378
    if-lez v13, :cond_13

    .line 379
    .line 380
    move/from16 v12, v17

    .line 381
    .line 382
    :cond_13
    sub-float v7, v12, v7

    .line 383
    .line 384
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 385
    .line 386
    .line 387
    move-result v7

    .line 388
    cmpl-float v7, v7, v14

    .line 389
    .line 390
    if-lez v7, :cond_14

    .line 391
    .line 392
    move v12, v15

    .line 393
    :cond_14
    invoke-static {v12}, Ljava/lang/Float;->isNaN(F)Z

    .line 394
    .line 395
    .line 396
    move-result v7

    .line 397
    if-nez v7, :cond_15

    .line 398
    .line 399
    goto :goto_4

    .line 400
    :cond_15
    const-wide v12, 0x402921fb54442d18L    # 12.566370614359172

    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    add-double/2addr v10, v12

    .line 406
    div-double v10, v10, v18

    .line 407
    .line 408
    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    .line 409
    .line 410
    .line 411
    move-result-wide v10

    .line 412
    mul-double/2addr v10, v2

    .line 413
    sub-double/2addr v10, v4

    .line 414
    double-to-float v2, v10

    .line 415
    cmpg-float v3, v2, v16

    .line 416
    .line 417
    if-gez v3, :cond_16

    .line 418
    .line 419
    goto :goto_6

    .line 420
    :cond_16
    move/from16 v16, v2

    .line 421
    .line 422
    :goto_6
    cmpl-float v3, v16, v17

    .line 423
    .line 424
    if-lez v3, :cond_17

    .line 425
    .line 426
    move/from16 v16, v17

    .line 427
    .line 428
    :cond_17
    sub-float v2, v16, v2

    .line 429
    .line 430
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 431
    .line 432
    .line 433
    move-result v2

    .line 434
    cmpl-float v2, v2, v14

    .line 435
    .line 436
    if-lez v2, :cond_3

    .line 437
    .line 438
    goto/16 :goto_a

    .line 439
    .line 440
    :cond_18
    if-nez v7, :cond_1f

    .line 441
    .line 442
    double-to-float v2, v10

    .line 443
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/P1;->z(F)F

    .line 444
    .line 445
    .line 446
    move-result v2

    .line 447
    neg-float v2, v2

    .line 448
    mul-float v3, v2, v9

    .line 449
    .line 450
    double-to-float v4, v4

    .line 451
    sub-float/2addr v3, v4

    .line 452
    cmpg-float v5, v3, v16

    .line 453
    .line 454
    if-gez v5, :cond_19

    .line 455
    .line 456
    move/from16 v5, v16

    .line 457
    .line 458
    goto :goto_7

    .line 459
    :cond_19
    move v5, v3

    .line 460
    :goto_7
    cmpl-float v7, v5, v17

    .line 461
    .line 462
    if-lez v7, :cond_1a

    .line 463
    .line 464
    move/from16 v5, v17

    .line 465
    .line 466
    :cond_1a
    sub-float v3, v5, v3

    .line 467
    .line 468
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 469
    .line 470
    .line 471
    move-result v3

    .line 472
    cmpl-float v3, v3, v14

    .line 473
    .line 474
    if-lez v3, :cond_1b

    .line 475
    .line 476
    move v5, v15

    .line 477
    :cond_1b
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 478
    .line 479
    .line 480
    move-result v3

    .line 481
    if-nez v3, :cond_1c

    .line 482
    .line 483
    move v15, v5

    .line 484
    goto :goto_a

    .line 485
    :cond_1c
    neg-float v2, v2

    .line 486
    sub-float/2addr v2, v4

    .line 487
    cmpg-float v3, v2, v16

    .line 488
    .line 489
    if-gez v3, :cond_1d

    .line 490
    .line 491
    goto :goto_8

    .line 492
    :cond_1d
    move/from16 v16, v2

    .line 493
    .line 494
    :goto_8
    cmpl-float v3, v16, v17

    .line 495
    .line 496
    if-lez v3, :cond_1e

    .line 497
    .line 498
    move/from16 v16, v17

    .line 499
    .line 500
    :cond_1e
    sub-float v2, v16, v2

    .line 501
    .line 502
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 503
    .line 504
    .line 505
    move-result v2

    .line 506
    cmpl-float v2, v2, v14

    .line 507
    .line 508
    if-lez v2, :cond_3

    .line 509
    .line 510
    goto :goto_a

    .line 511
    :cond_1f
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 512
    .line 513
    .line 514
    move-result-wide v2

    .line 515
    neg-double v12, v10

    .line 516
    add-double/2addr v12, v2

    .line 517
    double-to-float v7, v12

    .line 518
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/P1;->z(F)F

    .line 519
    .line 520
    .line 521
    move-result v7

    .line 522
    add-double/2addr v10, v2

    .line 523
    double-to-float v2, v10

    .line 524
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/P1;->z(F)F

    .line 525
    .line 526
    .line 527
    move-result v2

    .line 528
    sub-float/2addr v7, v2

    .line 529
    float-to-double v2, v7

    .line 530
    sub-double/2addr v2, v4

    .line 531
    double-to-float v2, v2

    .line 532
    cmpg-float v3, v2, v16

    .line 533
    .line 534
    if-gez v3, :cond_20

    .line 535
    .line 536
    goto :goto_9

    .line 537
    :cond_20
    move/from16 v16, v2

    .line 538
    .line 539
    :goto_9
    cmpl-float v3, v16, v17

    .line 540
    .line 541
    if-lez v3, :cond_21

    .line 542
    .line 543
    move/from16 v16, v17

    .line 544
    .line 545
    :cond_21
    sub-float v2, v16, v2

    .line 546
    .line 547
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 548
    .line 549
    .line 550
    move-result v2

    .line 551
    cmpl-float v2, v2, v14

    .line 552
    .line 553
    if-lez v2, :cond_3

    .line 554
    .line 555
    :goto_a
    invoke-static {v15}, Ljava/lang/Float;->isNaN(F)Z

    .line 556
    .line 557
    .line 558
    move-result v2

    .line 559
    iget v3, v0, Lu/t;->r:F

    .line 560
    .line 561
    if-nez v2, :cond_24

    .line 562
    .line 563
    const v1, 0x3eaaaaab

    .line 564
    .line 565
    .line 566
    sub-float v2, v3, v17

    .line 567
    .line 568
    add-float/2addr v2, v1

    .line 569
    mul-float/2addr v9, v3

    .line 570
    sub-float v1, v17, v9

    .line 571
    .line 572
    mul-float/2addr v2, v15

    .line 573
    add-float/2addr v2, v1

    .line 574
    mul-float/2addr v2, v15

    .line 575
    add-float/2addr v2, v3

    .line 576
    const/high16 v1, 0x40400000    # 3.0f

    .line 577
    .line 578
    mul-float/2addr v2, v1

    .line 579
    mul-float/2addr v2, v15

    .line 580
    iget v1, v0, Lu/t;->t:F

    .line 581
    .line 582
    cmpg-float v3, v2, v1

    .line 583
    .line 584
    if-gez v3, :cond_22

    .line 585
    .line 586
    move v2, v1

    .line 587
    :cond_22
    iget v1, v0, Lu/t;->u:F

    .line 588
    .line 589
    cmpl-float v3, v2, v1

    .line 590
    .line 591
    if-lez v3, :cond_23

    .line 592
    .line 593
    return v1

    .line 594
    :cond_23
    return v2

    .line 595
    :cond_24
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 596
    .line 597
    new-instance v4, Ljava/lang/StringBuilder;

    .line 598
    .line 599
    const-string v5, "The cubic curve with parameters ("

    .line 600
    .line 601
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 602
    .line 603
    .line 604
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 605
    .line 606
    .line 607
    const-string v5, ", "

    .line 608
    .line 609
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 619
    .line 620
    .line 621
    const-string v3, ", 1.0) has no solution at "

    .line 622
    .line 623
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 627
    .line 628
    .line 629
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v1

    .line 633
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    throw v2

    .line 637
    :cond_25
    return v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lu/t;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lu/t;

    .line 6
    .line 7
    iget v0, p1, Lu/t;->q:F

    .line 8
    .line 9
    iget v1, p0, Lu/t;->q:F

    .line 10
    .line 11
    cmpg-float v0, v1, v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget v0, p0, Lu/t;->r:F

    .line 16
    .line 17
    iget v1, p1, Lu/t;->r:F

    .line 18
    .line 19
    cmpg-float v0, v0, v1

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    iget v0, p0, Lu/t;->s:F

    .line 24
    .line 25
    iget p1, p1, Lu/t;->s:F

    .line 26
    .line 27
    cmpg-float p1, v0, p1

    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    return p1

    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lu/t;->q:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, Lu/t;->r:F

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Lk1/i;->b(FII)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lu/t;->s:F

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Lk1/i;->b(FII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/high16 v1, 0x3f800000    # 1.0f

    .line 23
    .line 24
    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    add-int/2addr v1, v0

    .line 29
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CubicBezierEasing(a="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lu/t;->q:F

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", b="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lu/t;->r:F

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", c="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget v1, p0, Lu/t;->s:F

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", d=1.0)"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
.end method
