.class public final synthetic LR4/c2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ5/w;


# static fields
.field public static final a:LR4/c2;

.field private static final descriptor:LX5/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LR4/c2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR4/c2;->a:LR4/c2;

    .line 7
    .line 8
    new-instance v1, LZ5/P;

    .line 9
    .line 10
    const-string v2, "com.web2native.RichBottomBarData"

    .line 11
    .line 12
    const/16 v3, 0x9

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, LZ5/P;-><init>(Ljava/lang/String;LZ5/w;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "regex"

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
    const-string v0, "iconColor"

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
    const-string v0, "cornerRadius"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "activeColor"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "floatingBtnBgColor"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "floatingBtnIconColor"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "tabs"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    sput-object v1, LR4/c2;->descriptor:LX5/f;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final a()[LV5/a;
    .locals 13

    .line 1
    sget-object v0, LR4/e2;->j:[Lm5/h;

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
    sget-object v7, LZ5/C;->a:LZ5/C;

    .line 31
    .line 32
    invoke-static {v7}, LC3/a;->A(LV5/a;)LV5/a;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    invoke-static {v1}, LC3/a;->A(LV5/a;)LV5/a;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    invoke-static {v1}, LC3/a;->A(LV5/a;)LV5/a;

    .line 41
    .line 42
    .line 43
    move-result-object v9

    .line 44
    invoke-static {v1}, LC3/a;->A(LV5/a;)LV5/a;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const/16 v10, 0x8

    .line 49
    .line 50
    aget-object v0, v0, v10

    .line 51
    .line 52
    invoke-interface {v0}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, LV5/a;

    .line 57
    .line 58
    invoke-static {v0}, LC3/a;->A(LV5/a;)LV5/a;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const/16 v11, 0x9

    .line 63
    .line 64
    new-array v11, v11, [LV5/a;

    .line 65
    .line 66
    const/4 v12, 0x0

    .line 67
    aput-object v2, v11, v12

    .line 68
    .line 69
    aput-object v4, v11, v3

    .line 70
    .line 71
    const/4 v2, 0x2

    .line 72
    aput-object v5, v11, v2

    .line 73
    .line 74
    const/4 v2, 0x3

    .line 75
    aput-object v6, v11, v2

    .line 76
    .line 77
    const/4 v2, 0x4

    .line 78
    aput-object v7, v11, v2

    .line 79
    .line 80
    const/4 v2, 0x5

    .line 81
    aput-object v8, v11, v2

    .line 82
    .line 83
    const/4 v2, 0x6

    .line 84
    aput-object v9, v11, v2

    .line 85
    .line 86
    const/4 v2, 0x7

    .line 87
    aput-object v1, v11, v2

    .line 88
    .line 89
    aput-object v0, v11, v10

    .line 90
    .line 91
    return-object v11
.end method

.method public final b()LX5/f;
    .locals 1

    .line 1
    sget-object v0, LR4/c2;->descriptor:LX5/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LY5/b;)Ljava/lang/Object;
    .locals 18

    .line 1
    sget-object v0, LR4/c2;->descriptor:LX5/f;

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
    sget-object v2, LR4/e2;->j:[Lm5/h;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    move-object v8, v5

    .line 13
    move-object v9, v8

    .line 14
    move-object v10, v9

    .line 15
    move-object v11, v10

    .line 16
    move-object v12, v11

    .line 17
    move-object v13, v12

    .line 18
    move-object v14, v13

    .line 19
    move-object v15, v14

    .line 20
    const/4 v6, 0x1

    .line 21
    const/4 v7, 0x0

    .line 22
    :goto_0
    if-eqz v6, :cond_0

    .line 23
    .line 24
    invoke-interface {v1, v0}, LY5/a;->j(LX5/f;)I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    packed-switch v4, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    new-instance v0, LV5/e;

    .line 32
    .line 33
    invoke-direct {v0, v4}, LV5/e;-><init>(I)V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :pswitch_0
    const/16 v4, 0x8

    .line 38
    .line 39
    aget-object v16, v2, v4

    .line 40
    .line 41
    invoke-interface/range {v16 .. v16}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v16

    .line 45
    const/16 v17, 0x1

    .line 46
    .line 47
    move-object/from16 v3, v16

    .line 48
    .line 49
    check-cast v3, LV5/a;

    .line 50
    .line 51
    invoke-interface {v1, v0, v4, v3, v5}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    move-object v5, v3

    .line 56
    check-cast v5, Ljava/util/List;

    .line 57
    .line 58
    or-int/lit16 v7, v7, 0x100

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :pswitch_1
    const/16 v17, 0x1

    .line 62
    .line 63
    sget-object v3, LZ5/a0;->a:LZ5/a0;

    .line 64
    .line 65
    const/4 v4, 0x7

    .line 66
    invoke-interface {v1, v0, v4, v3, v15}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    move-object v15, v3

    .line 71
    check-cast v15, Ljava/lang/String;

    .line 72
    .line 73
    or-int/lit16 v7, v7, 0x80

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :pswitch_2
    const/16 v17, 0x1

    .line 77
    .line 78
    sget-object v3, LZ5/a0;->a:LZ5/a0;

    .line 79
    .line 80
    const/4 v4, 0x6

    .line 81
    invoke-interface {v1, v0, v4, v3, v14}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    move-object v14, v3

    .line 86
    check-cast v14, Ljava/lang/String;

    .line 87
    .line 88
    or-int/lit8 v7, v7, 0x40

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :pswitch_3
    const/16 v17, 0x1

    .line 92
    .line 93
    sget-object v3, LZ5/a0;->a:LZ5/a0;

    .line 94
    .line 95
    const/4 v4, 0x5

    .line 96
    invoke-interface {v1, v0, v4, v3, v13}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    move-object v13, v3

    .line 101
    check-cast v13, Ljava/lang/String;

    .line 102
    .line 103
    or-int/lit8 v7, v7, 0x20

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :pswitch_4
    const/16 v17, 0x1

    .line 107
    .line 108
    sget-object v3, LZ5/C;->a:LZ5/C;

    .line 109
    .line 110
    const/4 v4, 0x4

    .line 111
    invoke-interface {v1, v0, v4, v3, v12}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    move-object v12, v3

    .line 116
    check-cast v12, Ljava/lang/Integer;

    .line 117
    .line 118
    or-int/lit8 v7, v7, 0x10

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :pswitch_5
    const/16 v17, 0x1

    .line 122
    .line 123
    sget-object v3, LZ5/a0;->a:LZ5/a0;

    .line 124
    .line 125
    const/4 v4, 0x3

    .line 126
    invoke-interface {v1, v0, v4, v3, v11}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    move-object v11, v3

    .line 131
    check-cast v11, Ljava/lang/String;

    .line 132
    .line 133
    or-int/lit8 v7, v7, 0x8

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :pswitch_6
    const/16 v17, 0x1

    .line 137
    .line 138
    sget-object v3, LZ5/a0;->a:LZ5/a0;

    .line 139
    .line 140
    const/4 v4, 0x2

    .line 141
    invoke-interface {v1, v0, v4, v3, v10}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    move-object v10, v3

    .line 146
    check-cast v10, Ljava/lang/String;

    .line 147
    .line 148
    or-int/lit8 v7, v7, 0x4

    .line 149
    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :pswitch_7
    const/16 v17, 0x1

    .line 153
    .line 154
    aget-object v3, v2, v17

    .line 155
    .line 156
    invoke-interface {v3}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    check-cast v3, LV5/a;

    .line 161
    .line 162
    move/from16 v4, v17

    .line 163
    .line 164
    invoke-interface {v1, v0, v4, v3, v9}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    move-object v9, v3

    .line 169
    check-cast v9, Ljava/util/List;

    .line 170
    .line 171
    or-int/lit8 v7, v7, 0x2

    .line 172
    .line 173
    goto/16 :goto_0

    .line 174
    .line 175
    :pswitch_8
    const/4 v4, 0x1

    .line 176
    sget-object v3, LZ5/a0;->a:LZ5/a0;

    .line 177
    .line 178
    const/4 v4, 0x0

    .line 179
    invoke-interface {v1, v0, v4, v3, v8}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    move-object v8, v3

    .line 184
    check-cast v8, Ljava/lang/String;

    .line 185
    .line 186
    or-int/lit8 v7, v7, 0x1

    .line 187
    .line 188
    goto/16 :goto_0

    .line 189
    .line 190
    :pswitch_9
    const/4 v4, 0x0

    .line 191
    move v6, v4

    .line 192
    goto/16 :goto_0

    .line 193
    .line 194
    :cond_0
    invoke-interface {v1, v0}, LY5/a;->l(LX5/f;)V

    .line 195
    .line 196
    .line 197
    new-instance v6, LR4/e2;

    .line 198
    .line 199
    move-object/from16 v16, v5

    .line 200
    .line 201
    invoke-direct/range {v6 .. v16}, LR4/e2;-><init>(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 202
    .line 203
    .line 204
    return-object v6

    .line 205
    :pswitch_data_0
    .packed-switch -0x1
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
