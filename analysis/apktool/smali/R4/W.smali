.class public final synthetic LR4/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ5/w;


# static fields
.field public static final a:LR4/W;

.field private static final descriptor:LX5/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LR4/W;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR4/W;->a:LR4/W;

    .line 7
    .line 8
    new-instance v1, LZ5/P;

    .line 9
    .line 10
    const-string v2, "com.web2native.DownloadFileManager"

    .line 11
    .line 12
    const/16 v3, 0xb

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, LZ5/P;-><init>(Ljava/lang/String;LZ5/w;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "enable"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "showOfflineOnNoInternetScreen"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "title"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "titleBarBgColor"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "titleBarContentColor"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "btnBgColor"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "borderColor"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "borderWidth"

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    invoke-virtual {v1, v0, v3}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v0, "downloadButtonText"

    .line 60
    .line 61
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    const-string v0, "roundedCornerPercent"

    .line 65
    .line 66
    invoke-virtual {v1, v0, v3}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    const-string v0, "textColor"

    .line 70
    .line 71
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    sput-object v1, LR4/W;->descriptor:LX5/f;

    .line 75
    .line 76
    return-void
.end method


# virtual methods
.method public final a()[LV5/a;
    .locals 13

    .line 1
    sget-object v0, LZ5/f;->a:LZ5/f;

    .line 2
    .line 3
    invoke-static {v0}, LC3/a;->A(LV5/a;)LV5/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, LZ5/a0;->a:LZ5/a0;

    .line 8
    .line 9
    invoke-static {v2}, LC3/a;->A(LV5/a;)LV5/a;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-static {v2}, LC3/a;->A(LV5/a;)LV5/a;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-static {v2}, LC3/a;->A(LV5/a;)LV5/a;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-static {v2}, LC3/a;->A(LV5/a;)LV5/a;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    invoke-static {v2}, LC3/a;->A(LV5/a;)LV5/a;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    sget-object v8, LZ5/C;->a:LZ5/C;

    .line 30
    .line 31
    invoke-static {v8}, LC3/a;->A(LV5/a;)LV5/a;

    .line 32
    .line 33
    .line 34
    move-result-object v9

    .line 35
    invoke-static {v2}, LC3/a;->A(LV5/a;)LV5/a;

    .line 36
    .line 37
    .line 38
    move-result-object v10

    .line 39
    invoke-static {v8}, LC3/a;->A(LV5/a;)LV5/a;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    invoke-static {v2}, LC3/a;->A(LV5/a;)LV5/a;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const/16 v11, 0xb

    .line 48
    .line 49
    new-array v11, v11, [LV5/a;

    .line 50
    .line 51
    const/4 v12, 0x0

    .line 52
    aput-object v1, v11, v12

    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    aput-object v0, v11, v1

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    aput-object v3, v11, v0

    .line 59
    .line 60
    const/4 v0, 0x3

    .line 61
    aput-object v4, v11, v0

    .line 62
    .line 63
    const/4 v0, 0x4

    .line 64
    aput-object v5, v11, v0

    .line 65
    .line 66
    const/4 v0, 0x5

    .line 67
    aput-object v6, v11, v0

    .line 68
    .line 69
    const/4 v0, 0x6

    .line 70
    aput-object v7, v11, v0

    .line 71
    .line 72
    const/4 v0, 0x7

    .line 73
    aput-object v9, v11, v0

    .line 74
    .line 75
    const/16 v0, 0x8

    .line 76
    .line 77
    aput-object v10, v11, v0

    .line 78
    .line 79
    const/16 v0, 0x9

    .line 80
    .line 81
    aput-object v8, v11, v0

    .line 82
    .line 83
    const/16 v0, 0xa

    .line 84
    .line 85
    aput-object v2, v11, v0

    .line 86
    .line 87
    return-object v11
.end method

.method public final b()LX5/f;
    .locals 1

    .line 1
    sget-object v0, LR4/W;->descriptor:LX5/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LY5/b;)Ljava/lang/Object;
    .locals 18

    .line 1
    sget-object v0, LR4/W;->descriptor:LX5/f;

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
    const/4 v4, 0x0

    .line 10
    move-object v5, v4

    .line 11
    move-object v7, v5

    .line 12
    move-object v9, v7

    .line 13
    move-object v10, v9

    .line 14
    move-object v11, v10

    .line 15
    move-object v12, v11

    .line 16
    move-object v13, v12

    .line 17
    move-object v14, v13

    .line 18
    move-object v15, v14

    .line 19
    const/4 v6, 0x1

    .line 20
    const/4 v8, 0x0

    .line 21
    const/16 v16, 0x0

    .line 22
    .line 23
    :goto_0
    if-eqz v6, :cond_0

    .line 24
    .line 25
    invoke-interface {v1, v0}, LY5/a;->j(LX5/f;)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    packed-switch v3, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    new-instance v0, LV5/e;

    .line 33
    .line 34
    invoke-direct {v0, v3}, LV5/e;-><init>(I)V

    .line 35
    .line 36
    .line 37
    throw v0

    .line 38
    :pswitch_0
    sget-object v3, LZ5/a0;->a:LZ5/a0;

    .line 39
    .line 40
    const/16 v2, 0xa

    .line 41
    .line 42
    invoke-interface {v1, v0, v2, v3, v5}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    move-object v5, v2

    .line 47
    check-cast v5, Ljava/lang/String;

    .line 48
    .line 49
    or-int/lit16 v8, v8, 0x400

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :pswitch_1
    sget-object v2, LZ5/C;->a:LZ5/C;

    .line 53
    .line 54
    const/16 v3, 0x9

    .line 55
    .line 56
    invoke-interface {v1, v0, v3, v2, v4}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    move-object v4, v2

    .line 61
    check-cast v4, Ljava/lang/Integer;

    .line 62
    .line 63
    or-int/lit16 v8, v8, 0x200

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :pswitch_2
    sget-object v2, LZ5/a0;->a:LZ5/a0;

    .line 67
    .line 68
    const/16 v3, 0x8

    .line 69
    .line 70
    invoke-interface {v1, v0, v3, v2, v15}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    move-object v15, v2

    .line 75
    check-cast v15, Ljava/lang/String;

    .line 76
    .line 77
    or-int/lit16 v8, v8, 0x100

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :pswitch_3
    sget-object v2, LZ5/C;->a:LZ5/C;

    .line 81
    .line 82
    const/4 v3, 0x7

    .line 83
    invoke-interface {v1, v0, v3, v2, v14}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    move-object v14, v2

    .line 88
    check-cast v14, Ljava/lang/Integer;

    .line 89
    .line 90
    or-int/lit16 v8, v8, 0x80

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :pswitch_4
    sget-object v2, LZ5/a0;->a:LZ5/a0;

    .line 94
    .line 95
    const/4 v3, 0x6

    .line 96
    invoke-interface {v1, v0, v3, v2, v13}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    move-object v13, v2

    .line 101
    check-cast v13, Ljava/lang/String;

    .line 102
    .line 103
    or-int/lit8 v8, v8, 0x40

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :pswitch_5
    sget-object v2, LZ5/a0;->a:LZ5/a0;

    .line 107
    .line 108
    const/4 v3, 0x5

    .line 109
    invoke-interface {v1, v0, v3, v2, v12}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    move-object v12, v2

    .line 114
    check-cast v12, Ljava/lang/String;

    .line 115
    .line 116
    or-int/lit8 v8, v8, 0x20

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :pswitch_6
    sget-object v2, LZ5/a0;->a:LZ5/a0;

    .line 120
    .line 121
    const/4 v3, 0x4

    .line 122
    invoke-interface {v1, v0, v3, v2, v11}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    move-object v11, v2

    .line 127
    check-cast v11, Ljava/lang/String;

    .line 128
    .line 129
    or-int/lit8 v8, v8, 0x10

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :pswitch_7
    sget-object v2, LZ5/a0;->a:LZ5/a0;

    .line 133
    .line 134
    const/4 v3, 0x3

    .line 135
    invoke-interface {v1, v0, v3, v2, v10}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    move-object v10, v2

    .line 140
    check-cast v10, Ljava/lang/String;

    .line 141
    .line 142
    or-int/lit8 v8, v8, 0x8

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :pswitch_8
    sget-object v2, LZ5/a0;->a:LZ5/a0;

    .line 146
    .line 147
    const/4 v3, 0x2

    .line 148
    invoke-interface {v1, v0, v3, v2, v9}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    move-object v9, v2

    .line 153
    check-cast v9, Ljava/lang/String;

    .line 154
    .line 155
    or-int/lit8 v8, v8, 0x4

    .line 156
    .line 157
    goto/16 :goto_0

    .line 158
    .line 159
    :pswitch_9
    const/4 v2, 0x1

    .line 160
    invoke-interface {v1, v0, v2}, LY5/a;->c(LX5/f;I)Z

    .line 161
    .line 162
    .line 163
    move-result v16

    .line 164
    or-int/lit8 v8, v8, 0x2

    .line 165
    .line 166
    goto/16 :goto_0

    .line 167
    .line 168
    :pswitch_a
    const/4 v2, 0x1

    .line 169
    sget-object v3, LZ5/f;->a:LZ5/f;

    .line 170
    .line 171
    const/4 v2, 0x0

    .line 172
    invoke-interface {v1, v0, v2, v3, v7}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    move-object v7, v3

    .line 177
    check-cast v7, Ljava/lang/Boolean;

    .line 178
    .line 179
    or-int/lit8 v8, v8, 0x1

    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :pswitch_b
    const/4 v2, 0x0

    .line 184
    move v6, v2

    .line 185
    goto/16 :goto_0

    .line 186
    .line 187
    :cond_0
    invoke-interface {v1, v0}, LY5/a;->l(LX5/f;)V

    .line 188
    .line 189
    .line 190
    move-object/from16 v17, v5

    .line 191
    .line 192
    new-instance v5, LR4/Y;

    .line 193
    .line 194
    move v6, v8

    .line 195
    move/from16 v8, v16

    .line 196
    .line 197
    move-object/from16 v16, v4

    .line 198
    .line 199
    invoke-direct/range {v5 .. v17}, LR4/Y;-><init>(ILjava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    return-object v5

    .line 203
    :pswitch_data_0
    .packed-switch -0x1
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
