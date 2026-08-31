.class public final LM/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LM/c;

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LM/c;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LM/c;->a:LM/c;

    .line 7
    .line 8
    sget v0, LO/k;->a:F

    .line 9
    .line 10
    sget v0, LO/k;->c:F

    .line 11
    .line 12
    const/16 v0, 0x280

    .line 13
    .line 14
    int-to-float v0, v0

    .line 15
    sput v0, LM/c;->b:F

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(Lc0/m;FFLj0/E;JLP/o;I)V
    .locals 16

    .line 1
    move-object/from16 v9, p7

    .line 2
    .line 3
    move/from16 v12, p8

    .line 4
    .line 5
    const v0, -0x515137eb

    .line 6
    .line 7
    .line 8
    invoke-virtual {v9, v0}, LP/o;->U(I)LP/o;

    .line 9
    .line 10
    .line 11
    or-int/lit16 v0, v12, 0x25b6

    .line 12
    .line 13
    and-int/lit16 v0, v0, 0x2493

    .line 14
    .line 15
    const/16 v1, 0x2492

    .line 16
    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v9}, LP/o;->x()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v9}, LP/o;->N()V

    .line 27
    .line 28
    .line 29
    move-object/from16 v2, p1

    .line 30
    .line 31
    move/from16 v3, p2

    .line 32
    .line 33
    move/from16 v4, p3

    .line 34
    .line 35
    move-object/from16 v5, p4

    .line 36
    .line 37
    move-wide/from16 v6, p5

    .line 38
    .line 39
    goto/16 :goto_3

    .line 40
    .line 41
    :cond_1
    :goto_0
    invoke-virtual {v9}, LP/o;->P()V

    .line 42
    .line 43
    .line 44
    and-int/lit8 v0, v12, 0x1

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    invoke-virtual {v9}, LP/o;->w()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    invoke-virtual {v9}, LP/o;->N()V

    .line 56
    .line 57
    .line 58
    move-object/from16 v13, p1

    .line 59
    .line 60
    move/from16 v14, p2

    .line 61
    .line 62
    move/from16 v15, p3

    .line 63
    .line 64
    move-object/from16 v1, p4

    .line 65
    .line 66
    move-wide/from16 v2, p5

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    :goto_1
    sget v0, LO/k;->b:F

    .line 70
    .line 71
    sget v1, LO/k;->a:F

    .line 72
    .line 73
    sget-object v2, LM/D0;->a:LP/T0;

    .line 74
    .line 75
    invoke-virtual {v9, v2}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, LM/C0;

    .line 80
    .line 81
    iget-object v2, v2, LM/C0;->e:LH/d;

    .line 82
    .line 83
    const/16 v3, 0x13

    .line 84
    .line 85
    invoke-static {v3, v9}, LM/k;->e(ILP/o;)J

    .line 86
    .line 87
    .line 88
    move-result-wide v3

    .line 89
    sget-object v5, Lc0/j;->q:Lc0/j;

    .line 90
    .line 91
    move v14, v0

    .line 92
    move v15, v1

    .line 93
    move-object v1, v2

    .line 94
    move-wide v2, v3

    .line 95
    move-object v13, v5

    .line 96
    :goto_2
    invoke-virtual {v9}, LP/o;->q()V

    .line 97
    .line 98
    .line 99
    const v0, 0x7f11008d

    .line 100
    .line 101
    .line 102
    invoke-static {v0, v9}, LN/s;->a(ILP/o;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    const/4 v4, 0x0

    .line 107
    sget v5, LM/G0;->a:F

    .line 108
    .line 109
    const/4 v6, 0x1

    .line 110
    invoke-static {v13, v4, v5, v6}, Landroidx/compose/foundation/layout/b;->c(Lc0/m;FFI)Lc0/m;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-virtual {v9, v0}, LP/o;->g(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    invoke-virtual {v9}, LP/o;->H()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    if-nez v5, :cond_4

    .line 123
    .line 124
    sget-object v5, LP/k;->a:LP/S;

    .line 125
    .line 126
    if-ne v6, v5, :cond_5

    .line 127
    .line 128
    :cond_4
    new-instance v6, LI0/k;

    .line 129
    .line 130
    const/4 v5, 0x1

    .line 131
    invoke-direct {v6, v0, v5}, LI0/k;-><init>(Ljava/lang/String;I)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v9, v6}, LP/o;->d0(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :cond_5
    check-cast v6, LB5/c;

    .line 138
    .line 139
    const/4 v0, 0x0

    .line 140
    invoke-static {v4, v0, v6}, LI0/j;->a(Lc0/m;ZLB5/c;)Lc0/m;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    new-instance v4, LM/a;

    .line 145
    .line 146
    invoke-direct {v4, v14, v15}, LM/a;-><init>(FF)V

    .line 147
    .line 148
    .line 149
    const v5, -0x3df6a050

    .line 150
    .line 151
    .line 152
    invoke-static {v5, v4, v9}, LX/k;->d(ILm5/e;LP/o;)LX/e;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    const/high16 v10, 0xc00000

    .line 157
    .line 158
    const/16 v11, 0x78

    .line 159
    .line 160
    const-wide/16 v4, 0x0

    .line 161
    .line 162
    const/4 v6, 0x0

    .line 163
    const/4 v7, 0x0

    .line 164
    invoke-static/range {v0 .. v11}, LM/L0;->a(Lc0/m;Lj0/E;JJFFLX/e;LP/o;II)V

    .line 165
    .line 166
    .line 167
    move-object v5, v1

    .line 168
    move-wide v6, v2

    .line 169
    move-object v2, v13

    .line 170
    move v3, v14

    .line 171
    move v4, v15

    .line 172
    :goto_3
    invoke-virtual/range {p7 .. p7}, LP/o;->r()LP/o0;

    .line 173
    .line 174
    .line 175
    move-result-object v9

    .line 176
    if-eqz v9, :cond_6

    .line 177
    .line 178
    new-instance v0, LM/b;

    .line 179
    .line 180
    move-object/from16 v1, p0

    .line 181
    .line 182
    move v8, v12

    .line 183
    invoke-direct/range {v0 .. v8}, LM/b;-><init>(LM/c;Lc0/m;FFLj0/E;JI)V

    .line 184
    .line 185
    .line 186
    iput-object v0, v9, LP/o0;->d:LB5/e;

    .line 187
    .line 188
    :cond_6
    return-void
.end method
