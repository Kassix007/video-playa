.class public final synthetic LR4/M1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ5/w;


# static fields
.field public static final a:LR4/M1;

.field private static final descriptor:LX5/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LR4/M1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR4/M1;->a:LR4/M1;

    .line 7
    .line 8
    new-instance v1, LZ5/P;

    .line 9
    .line 10
    const-string v2, "com.web2native.Onboarding"

    .line 11
    .line 12
    const/16 v3, 0x9

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, LZ5/P;-><init>(Ljava/lang/String;LZ5/w;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "actionButtons"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "bgColor"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "pageIndicator"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "pages"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "showAlways"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "skipButton"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "version"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "showOnAppUpdate"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "onboardingShowInterval"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, LZ5/P;->k(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    sput-object v1, LR4/M1;->descriptor:LX5/f;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final a()[LV5/a;
    .locals 12

    .line 1
    sget-object v0, LR4/O1;->j:[Lm5/h;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v2, v0, v1

    .line 5
    .line 6
    invoke-interface {v2}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    check-cast v2, LV5/a;

    .line 11
    .line 12
    invoke-static {v2}, LC3/a;->A(LV5/a;)LV5/a;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    sget-object v3, LZ5/a0;->a:LZ5/a0;

    .line 17
    .line 18
    invoke-static {v3}, LC3/a;->A(LV5/a;)LV5/a;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    sget-object v4, LR4/S1;->a:LR4/S1;

    .line 23
    .line 24
    invoke-static {v4}, LC3/a;->A(LV5/a;)LV5/a;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    const/4 v5, 0x3

    .line 29
    aget-object v0, v0, v5

    .line 30
    .line 31
    invoke-interface {v0}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, LV5/a;

    .line 36
    .line 37
    invoke-static {v0}, LC3/a;->A(LV5/a;)LV5/a;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sget-object v6, LZ5/f;->a:LZ5/f;

    .line 42
    .line 43
    invoke-static {v6}, LC3/a;->A(LV5/a;)LV5/a;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    sget-object v8, LR4/v;->a:LR4/v;

    .line 48
    .line 49
    invoke-static {v8}, LC3/a;->A(LV5/a;)LV5/a;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    sget-object v9, LZ5/C;->a:LZ5/C;

    .line 54
    .line 55
    invoke-static {v9}, LC3/a;->A(LV5/a;)LV5/a;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    invoke-static {v6}, LC3/a;->A(LV5/a;)LV5/a;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-static {v9}, LC3/a;->A(LV5/a;)LV5/a;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    const/16 v11, 0x9

    .line 68
    .line 69
    new-array v11, v11, [LV5/a;

    .line 70
    .line 71
    aput-object v2, v11, v1

    .line 72
    .line 73
    const/4 v1, 0x1

    .line 74
    aput-object v3, v11, v1

    .line 75
    .line 76
    const/4 v1, 0x2

    .line 77
    aput-object v4, v11, v1

    .line 78
    .line 79
    aput-object v0, v11, v5

    .line 80
    .line 81
    const/4 v0, 0x4

    .line 82
    aput-object v7, v11, v0

    .line 83
    .line 84
    const/4 v0, 0x5

    .line 85
    aput-object v8, v11, v0

    .line 86
    .line 87
    const/4 v0, 0x6

    .line 88
    aput-object v10, v11, v0

    .line 89
    .line 90
    const/4 v0, 0x7

    .line 91
    aput-object v6, v11, v0

    .line 92
    .line 93
    const/16 v0, 0x8

    .line 94
    .line 95
    aput-object v9, v11, v0

    .line 96
    .line 97
    return-object v11
.end method

.method public final b()LX5/f;
    .locals 1

    .line 1
    sget-object v0, LR4/M1;->descriptor:LX5/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LY5/b;)Ljava/lang/Object;
    .locals 17

    .line 1
    sget-object v0, LR4/M1;->descriptor:LX5/f;

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
    sget-object v2, LR4/O1;->j:[Lm5/h;

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
    const/16 p1, 0x0

    .line 25
    .line 26
    invoke-interface {v1, v0}, LY5/a;->j(LX5/f;)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    packed-switch v4, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    new-instance v0, LV5/e;

    .line 34
    .line 35
    invoke-direct {v0, v4}, LV5/e;-><init>(I)V

    .line 36
    .line 37
    .line 38
    throw v0

    .line 39
    :pswitch_0
    sget-object v4, LZ5/C;->a:LZ5/C;

    .line 40
    .line 41
    const/16 v3, 0x8

    .line 42
    .line 43
    invoke-interface {v1, v0, v3, v4, v5}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    move-object v5, v3

    .line 48
    check-cast v5, Ljava/lang/Integer;

    .line 49
    .line 50
    or-int/lit16 v7, v7, 0x100

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :pswitch_1
    sget-object v3, LZ5/f;->a:LZ5/f;

    .line 54
    .line 55
    const/4 v4, 0x7

    .line 56
    invoke-interface {v1, v0, v4, v3, v15}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    move-object v15, v3

    .line 61
    check-cast v15, Ljava/lang/Boolean;

    .line 62
    .line 63
    or-int/lit16 v7, v7, 0x80

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :pswitch_2
    sget-object v3, LZ5/C;->a:LZ5/C;

    .line 67
    .line 68
    const/4 v4, 0x6

    .line 69
    invoke-interface {v1, v0, v4, v3, v14}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    move-object v14, v3

    .line 74
    check-cast v14, Ljava/lang/Integer;

    .line 75
    .line 76
    or-int/lit8 v7, v7, 0x40

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :pswitch_3
    sget-object v3, LR4/v;->a:LR4/v;

    .line 80
    .line 81
    const/4 v4, 0x5

    .line 82
    invoke-interface {v1, v0, v4, v3, v13}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    move-object v13, v3

    .line 87
    check-cast v13, LR4/x;

    .line 88
    .line 89
    or-int/lit8 v7, v7, 0x20

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :pswitch_4
    sget-object v3, LZ5/f;->a:LZ5/f;

    .line 93
    .line 94
    const/4 v4, 0x4

    .line 95
    invoke-interface {v1, v0, v4, v3, v12}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    move-object v12, v3

    .line 100
    check-cast v12, Ljava/lang/Boolean;

    .line 101
    .line 102
    or-int/lit8 v7, v7, 0x10

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :pswitch_5
    const/4 v3, 0x3

    .line 106
    aget-object v4, v2, v3

    .line 107
    .line 108
    invoke-interface {v4}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    check-cast v4, LV5/a;

    .line 113
    .line 114
    invoke-interface {v1, v0, v3, v4, v11}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    move-object v11, v3

    .line 119
    check-cast v11, Ljava/util/List;

    .line 120
    .line 121
    or-int/lit8 v7, v7, 0x8

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :pswitch_6
    sget-object v3, LR4/S1;->a:LR4/S1;

    .line 125
    .line 126
    const/4 v4, 0x2

    .line 127
    invoke-interface {v1, v0, v4, v3, v10}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    move-object v10, v3

    .line 132
    check-cast v10, LR4/U1;

    .line 133
    .line 134
    or-int/lit8 v7, v7, 0x4

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :pswitch_7
    sget-object v3, LZ5/a0;->a:LZ5/a0;

    .line 138
    .line 139
    const/4 v4, 0x1

    .line 140
    invoke-interface {v1, v0, v4, v3, v9}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    move-object v9, v3

    .line 145
    check-cast v9, Ljava/lang/String;

    .line 146
    .line 147
    or-int/lit8 v7, v7, 0x2

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :pswitch_8
    const/4 v4, 0x1

    .line 151
    aget-object v3, v2, p1

    .line 152
    .line 153
    invoke-interface {v3}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    check-cast v3, LV5/a;

    .line 158
    .line 159
    move/from16 v4, p1

    .line 160
    .line 161
    invoke-interface {v1, v0, v4, v3, v8}, LY5/a;->i(LX5/f;ILV5/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    move-object v8, v3

    .line 166
    check-cast v8, Ljava/util/List;

    .line 167
    .line 168
    or-int/lit8 v7, v7, 0x1

    .line 169
    .line 170
    goto/16 :goto_0

    .line 171
    .line 172
    :pswitch_9
    move/from16 v4, p1

    .line 173
    .line 174
    move v6, v4

    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :cond_0
    invoke-interface {v1, v0}, LY5/a;->l(LX5/f;)V

    .line 178
    .line 179
    .line 180
    new-instance v6, LR4/O1;

    .line 181
    .line 182
    move-object/from16 v16, v5

    .line 183
    .line 184
    invoke-direct/range {v6 .. v16}, LR4/O1;-><init>(ILjava/util/List;Ljava/lang/String;LR4/U1;Ljava/util/List;Ljava/lang/Boolean;LR4/x;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)V

    .line 185
    .line 186
    .line 187
    return-object v6

    .line 188
    nop

    .line 189
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
