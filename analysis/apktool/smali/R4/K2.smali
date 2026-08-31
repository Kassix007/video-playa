.class public final synthetic LR4/K2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ5/w;


# static fields
.field public static final a:LR4/K2;

.field private static final descriptor:LX5/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LR4/K2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR4/K2;->a:LR4/K2;

    .line 7
    .line 8
    new-instance v1, LZ5/P;

    .line 9
    .line 10
    const-string v2, "com.web2native.StickyFooterItem"

    .line 11
    .line 12
    const/16 v3, 0xc

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, LZ5/P;-><init>(Ljava/lang/String;LZ5/w;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "regEx"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "mapping"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "fontFamily"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "bgColor"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "iconColor"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "tabs"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "fontSize"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "iconFontSize"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "textColor"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "height"

    .line 64
    .line 65
    const/4 v3, 0x0

    .line 66
    invoke-virtual {v1, v0, v3}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    const-string v0, "activeIconColor"

    .line 70
    .line 71
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    const-string v0, "activeTextColor"

    .line 75
    .line 76
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    sput-object v1, LR4/K2;->descriptor:LX5/f;

    .line 80
    .line 81
    return-void
.end method


# virtual methods
.method public final a()[LV5/a;
    .locals 16

    .line 1
    sget-object v0, LR4/M2;->m:[Lm5/h;

    .line 2
    .line 3
    sget-object v1, LZ5/a0;->a:LZ5/a0;

    .line 4
    .line 5
    invoke-static {v1}, LC3/a;->A(LV5/a;)LV5/a;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const/4 v3, 0x1

    .line 10
    aget-object v4, v0, v3

    .line 11
    .line 12
    invoke-interface {v4}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    check-cast v4, LV5/a;

    .line 17
    .line 18
    invoke-static {v4}, LC3/a;->A(LV5/a;)LV5/a;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-static {v1}, LC3/a;->A(LV5/a;)LV5/a;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-static {v1}, LC3/a;->A(LV5/a;)LV5/a;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    invoke-static {v1}, LC3/a;->A(LV5/a;)LV5/a;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    const/4 v8, 0x5

    .line 35
    aget-object v0, v0, v8

    .line 36
    .line 37
    invoke-interface {v0}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, LV5/a;

    .line 42
    .line 43
    invoke-static {v0}, LC3/a;->A(LV5/a;)LV5/a;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sget-object v9, LZ5/C;->a:LZ5/C;

    .line 48
    .line 49
    invoke-static {v9}, LC3/a;->A(LV5/a;)LV5/a;

    .line 50
    .line 51
    .line 52
    move-result-object v10

    .line 53
    invoke-static {v9}, LC3/a;->A(LV5/a;)LV5/a;

    .line 54
    .line 55
    .line 56
    move-result-object v11

    .line 57
    invoke-static {v1}, LC3/a;->A(LV5/a;)LV5/a;

    .line 58
    .line 59
    .line 60
    move-result-object v12

    .line 61
    invoke-static {v9}, LC3/a;->A(LV5/a;)LV5/a;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    invoke-static {v1}, LC3/a;->A(LV5/a;)LV5/a;

    .line 66
    .line 67
    .line 68
    move-result-object v13

    .line 69
    invoke-static {v1}, LC3/a;->A(LV5/a;)LV5/a;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    const/16 v14, 0xc

    .line 74
    .line 75
    new-array v14, v14, [LV5/a;

    .line 76
    .line 77
    const/4 v15, 0x0

    .line 78
    aput-object v2, v14, v15

    .line 79
    .line 80
    aput-object v4, v14, v3

    .line 81
    .line 82
    const/4 v2, 0x2

    .line 83
    aput-object v5, v14, v2

    .line 84
    .line 85
    const/4 v2, 0x3

    .line 86
    aput-object v6, v14, v2

    .line 87
    .line 88
    const/4 v2, 0x4

    .line 89
    aput-object v7, v14, v2

    .line 90
    .line 91
    aput-object v0, v14, v8

    .line 92
    .line 93
    const/4 v0, 0x6

    .line 94
    aput-object v10, v14, v0

    .line 95
    .line 96
    const/4 v0, 0x7

    .line 97
    aput-object v11, v14, v0

    .line 98
    .line 99
    const/16 v0, 0x8

    .line 100
    .line 101
    aput-object v12, v14, v0

    .line 102
    .line 103
    const/16 v0, 0x9

    .line 104
    .line 105
    aput-object v9, v14, v0

    .line 106
    .line 107
    const/16 v0, 0xa

    .line 108
    .line 109
    aput-object v13, v14, v0

    .line 110
    .line 111
    const/16 v0, 0xb

    .line 112
    .line 113
    aput-object v1, v14, v0

    .line 114
    .line 115
    return-object v14
.end method

.method public final b()LX5/f;
    .locals 1

    .line 1
    sget-object v0, LR4/K2;->descriptor:LX5/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LY5/b;)Ljava/lang/Object;
    .locals 20

    .line 1
    sget-object v0, LR4/K2;->descriptor:LX5/f;

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-interface {v1, v0}, LY5/b;->a(LX5/f;)LY5/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, LR4/M2;->m:[Lm5/h;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    move-object v4, v5

    .line 13
    move-object v6, v4

    .line 14
    move-object v7, v6

    .line 15
    move-object v8, v7

    .line 16
    move-object v9, v8

    .line 17
    move-object v10, v9

    .line 18
    move-object v11, v10

    .line 19
    move-object v12, v11

    .line 20
    move-object v13, v12

    .line 21
    move-object v14, v13

    .line 22
    move-object v15, v14

    .line 23
    const/4 v3, 0x0

    .line 24
    const/16 v16, 0x1

    .line 25
    .line 26
    :goto_0
    const/16 v17, 0x1

    .line 27
    .line 28
    :goto_1
    if-eqz v16, :cond_0

    .line 29
    .line 30
    move-object/from16 v18, v2

    .line 31
    .line 32
    invoke-interface {v1, v0}, LY5/a;->j(LX5/f;)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    packed-switch v2, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    new-instance v0, LV5/e;

    .line 40
    .line 41
    invoke-direct {v0, v2}, LV5/e;-><init>(I)V

    .line 42
    .line 43
    .line 44
    throw v0

    .line 45
    :pswitch_0
    sget-object v2, LZ5/a0;->a:LZ5/a0;

    .line 46
    .line 47
    move-object/from16 v19, v8

    .line 48
    .line 49
    const/16 v8, 0xb

    .line 50
    .line 51
    invoke-interface {v1, v0, v8, v2, v4}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    move-object v4, v2

    .line 56
    check-cast v4, Ljava/lang/String;

    .line 57
    .line 58
    or-int/lit16 v3, v3, 0x800

    .line 59
    .line 60
    :goto_2
    move-object/from16 v2, v18

    .line 61
    .line 62
    move-object/from16 v8, v19

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :pswitch_1
    move-object/from16 v19, v8

    .line 66
    .line 67
    sget-object v2, LZ5/a0;->a:LZ5/a0;

    .line 68
    .line 69
    const/16 v8, 0xa

    .line 70
    .line 71
    invoke-interface {v1, v0, v8, v2, v7}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    move-object v7, v2

    .line 76
    check-cast v7, Ljava/lang/String;

    .line 77
    .line 78
    or-int/lit16 v3, v3, 0x400

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :pswitch_2
    move-object/from16 v19, v8

    .line 82
    .line 83
    sget-object v2, LZ5/C;->a:LZ5/C;

    .line 84
    .line 85
    const/16 v8, 0x9

    .line 86
    .line 87
    invoke-interface {v1, v0, v8, v2, v6}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    move-object v6, v2

    .line 92
    check-cast v6, Ljava/lang/Integer;

    .line 93
    .line 94
    or-int/lit16 v3, v3, 0x200

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :pswitch_3
    move-object/from16 v19, v8

    .line 98
    .line 99
    sget-object v2, LZ5/a0;->a:LZ5/a0;

    .line 100
    .line 101
    const/16 v8, 0x8

    .line 102
    .line 103
    invoke-interface {v1, v0, v8, v2, v5}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    move-object v5, v2

    .line 108
    check-cast v5, Ljava/lang/String;

    .line 109
    .line 110
    or-int/lit16 v3, v3, 0x100

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :pswitch_4
    move-object/from16 v19, v8

    .line 114
    .line 115
    sget-object v2, LZ5/C;->a:LZ5/C;

    .line 116
    .line 117
    const/4 v8, 0x7

    .line 118
    invoke-interface {v1, v0, v8, v2, v15}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    move-object v15, v2

    .line 123
    check-cast v15, Ljava/lang/Integer;

    .line 124
    .line 125
    or-int/lit16 v3, v3, 0x80

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :pswitch_5
    move-object/from16 v19, v8

    .line 129
    .line 130
    sget-object v2, LZ5/C;->a:LZ5/C;

    .line 131
    .line 132
    const/4 v8, 0x6

    .line 133
    invoke-interface {v1, v0, v8, v2, v14}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    move-object v14, v2

    .line 138
    check-cast v14, Ljava/lang/Integer;

    .line 139
    .line 140
    or-int/lit8 v3, v3, 0x40

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :pswitch_6
    move-object/from16 v19, v8

    .line 144
    .line 145
    const/4 v2, 0x5

    .line 146
    aget-object v8, v18, v2

    .line 147
    .line 148
    invoke-interface {v8}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    check-cast v8, LV5/a;

    .line 153
    .line 154
    invoke-interface {v1, v0, v2, v8, v13}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    move-object v13, v2

    .line 159
    check-cast v13, Ljava/util/List;

    .line 160
    .line 161
    or-int/lit8 v3, v3, 0x20

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :pswitch_7
    move-object/from16 v19, v8

    .line 165
    .line 166
    sget-object v2, LZ5/a0;->a:LZ5/a0;

    .line 167
    .line 168
    const/4 v8, 0x4

    .line 169
    invoke-interface {v1, v0, v8, v2, v12}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    move-object v12, v2

    .line 174
    check-cast v12, Ljava/lang/String;

    .line 175
    .line 176
    or-int/lit8 v3, v3, 0x10

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :pswitch_8
    move-object/from16 v19, v8

    .line 180
    .line 181
    sget-object v2, LZ5/a0;->a:LZ5/a0;

    .line 182
    .line 183
    const/4 v8, 0x3

    .line 184
    invoke-interface {v1, v0, v8, v2, v11}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    move-object v11, v2

    .line 189
    check-cast v11, Ljava/lang/String;

    .line 190
    .line 191
    or-int/lit8 v3, v3, 0x8

    .line 192
    .line 193
    goto/16 :goto_2

    .line 194
    .line 195
    :pswitch_9
    move-object/from16 v19, v8

    .line 196
    .line 197
    sget-object v2, LZ5/a0;->a:LZ5/a0;

    .line 198
    .line 199
    const/4 v8, 0x2

    .line 200
    invoke-interface {v1, v0, v8, v2, v10}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    move-object v10, v2

    .line 205
    check-cast v10, Ljava/lang/String;

    .line 206
    .line 207
    or-int/lit8 v3, v3, 0x4

    .line 208
    .line 209
    goto/16 :goto_2

    .line 210
    .line 211
    :pswitch_a
    move-object/from16 v19, v8

    .line 212
    .line 213
    aget-object v2, v18, v17

    .line 214
    .line 215
    invoke-interface {v2}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    check-cast v2, LV5/a;

    .line 220
    .line 221
    move/from16 v8, v17

    .line 222
    .line 223
    invoke-interface {v1, v0, v8, v2, v9}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    move-object v9, v2

    .line 228
    check-cast v9, Ljava/util/List;

    .line 229
    .line 230
    or-int/lit8 v3, v3, 0x2

    .line 231
    .line 232
    goto/16 :goto_2

    .line 233
    .line 234
    :pswitch_b
    move-object/from16 v19, v8

    .line 235
    .line 236
    move/from16 v8, v17

    .line 237
    .line 238
    sget-object v2, LZ5/a0;->a:LZ5/a0;

    .line 239
    .line 240
    move-object/from16 v8, v19

    .line 241
    .line 242
    move/from16 v19, v3

    .line 243
    .line 244
    const/4 v3, 0x0

    .line 245
    invoke-interface {v1, v0, v3, v2, v8}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    move-object v8, v2

    .line 250
    check-cast v8, Ljava/lang/String;

    .line 251
    .line 252
    or-int/lit8 v2, v19, 0x1

    .line 253
    .line 254
    move v3, v2

    .line 255
    move-object/from16 v2, v18

    .line 256
    .line 257
    goto/16 :goto_0

    .line 258
    .line 259
    :pswitch_c
    move/from16 v19, v3

    .line 260
    .line 261
    const/4 v3, 0x0

    .line 262
    move/from16 v16, v3

    .line 263
    .line 264
    move-object/from16 v2, v18

    .line 265
    .line 266
    move/from16 v3, v19

    .line 267
    .line 268
    goto/16 :goto_0

    .line 269
    .line 270
    :cond_0
    move/from16 v19, v3

    .line 271
    .line 272
    invoke-interface {v1, v0}, LY5/a;->l(LX5/f;)V

    .line 273
    .line 274
    .line 275
    move-object/from16 v17, v6

    .line 276
    .line 277
    new-instance v6, LR4/M2;

    .line 278
    .line 279
    move-object/from16 v16, v5

    .line 280
    .line 281
    move-object/from16 v18, v7

    .line 282
    .line 283
    move/from16 v7, v19

    .line 284
    .line 285
    move-object/from16 v19, v4

    .line 286
    .line 287
    invoke-direct/range {v6 .. v19}, LR4/M2;-><init>(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    return-object v6

    .line 291
    :pswitch_data_0
    .packed-switch -0x1
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
