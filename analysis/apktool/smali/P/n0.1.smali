.class public final LP/n0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:LP/o0;

.field public final synthetic r:I

.field public final synthetic s:Lr/B;


# direct methods
.method public constructor <init>(LP/o0;ILr/B;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP/n0;->q:LP/o0;

    .line 2
    .line 3
    iput p2, p0, LP/n0;->r:I

    .line 4
    .line 5
    iput-object p3, p0, LP/n0;->s:Lr/B;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, LP/q;

    .line 6
    .line 7
    iget-object v2, v0, LP/n0;->q:LP/o0;

    .line 8
    .line 9
    iget v3, v2, LP/o0;->e:I

    .line 10
    .line 11
    iget v4, v0, LP/n0;->r:I

    .line 12
    .line 13
    if-ne v3, v4, :cond_9

    .line 14
    .line 15
    iget-object v3, v2, LP/o0;->f:Lr/B;

    .line 16
    .line 17
    iget-object v5, v0, LP/n0;->s:Lr/B;

    .line 18
    .line 19
    invoke-static {v5, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_9

    .line 24
    .line 25
    instance-of v3, v1, LP/u;

    .line 26
    .line 27
    if-eqz v3, :cond_9

    .line 28
    .line 29
    iget-object v3, v5, Lr/B;->a:[J

    .line 30
    .line 31
    array-length v6, v3

    .line 32
    add-int/lit8 v6, v6, -0x2

    .line 33
    .line 34
    if-ltz v6, :cond_9

    .line 35
    .line 36
    const/4 v8, 0x0

    .line 37
    :goto_0
    aget-wide v9, v3, v8

    .line 38
    .line 39
    not-long v11, v9

    .line 40
    const/4 v13, 0x7

    .line 41
    shl-long/2addr v11, v13

    .line 42
    and-long/2addr v11, v9

    .line 43
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    and-long/2addr v11, v13

    .line 49
    cmp-long v11, v11, v13

    .line 50
    .line 51
    if-eqz v11, :cond_8

    .line 52
    .line 53
    sub-int v11, v8, v6

    .line 54
    .line 55
    not-int v11, v11

    .line 56
    ushr-int/lit8 v11, v11, 0x1f

    .line 57
    .line 58
    const/16 v12, 0x8

    .line 59
    .line 60
    rsub-int/lit8 v11, v11, 0x8

    .line 61
    .line 62
    const/4 v13, 0x0

    .line 63
    :goto_1
    if-ge v13, v11, :cond_7

    .line 64
    .line 65
    const-wide/16 v14, 0xff

    .line 66
    .line 67
    and-long/2addr v14, v9

    .line 68
    const-wide/16 v16, 0x80

    .line 69
    .line 70
    cmp-long v14, v14, v16

    .line 71
    .line 72
    if-gez v14, :cond_5

    .line 73
    .line 74
    shl-int/lit8 v14, v8, 0x3

    .line 75
    .line 76
    add-int/2addr v14, v13

    .line 77
    iget-object v15, v5, Lr/B;->b:[Ljava/lang/Object;

    .line 78
    .line 79
    aget-object v15, v15, v14

    .line 80
    .line 81
    iget-object v7, v5, Lr/B;->c:[I

    .line 82
    .line 83
    aget v7, v7, v14

    .line 84
    .line 85
    if-eq v7, v4, :cond_0

    .line 86
    .line 87
    const/4 v7, 0x1

    .line 88
    goto :goto_2

    .line 89
    :cond_0
    const/4 v7, 0x0

    .line 90
    :goto_2
    if-eqz v7, :cond_3

    .line 91
    .line 92
    move/from16 v16, v12

    .line 93
    .line 94
    move-object v12, v1

    .line 95
    check-cast v12, LP/u;

    .line 96
    .line 97
    iget-object v0, v12, LP/u;->w:Lr/G;

    .line 98
    .line 99
    invoke-static {v0, v15, v2}, La/a;->K(Lr/G;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    instance-of v0, v15, LP/C;

    .line 103
    .line 104
    if-eqz v0, :cond_2

    .line 105
    .line 106
    move-object v0, v15

    .line 107
    check-cast v0, LP/C;

    .line 108
    .line 109
    move-object/from16 v17, v1

    .line 110
    .line 111
    iget-object v1, v12, LP/u;->w:Lr/G;

    .line 112
    .line 113
    invoke-virtual {v1, v0}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-nez v1, :cond_1

    .line 118
    .line 119
    iget-object v1, v12, LP/u;->z:Lr/G;

    .line 120
    .line 121
    invoke-static {v1, v0}, La/a;->L(Lr/G;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :cond_1
    iget-object v0, v2, LP/o0;->g:Lr/G;

    .line 125
    .line 126
    if-eqz v0, :cond_4

    .line 127
    .line 128
    invoke-virtual {v0, v15}, Lr/G;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_2
    move-object/from16 v17, v1

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_3
    move-object/from16 v17, v1

    .line 136
    .line 137
    move/from16 v16, v12

    .line 138
    .line 139
    :cond_4
    :goto_3
    if-eqz v7, :cond_6

    .line 140
    .line 141
    invoke-virtual {v5, v14}, Lr/B;->f(I)V

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_5
    move-object/from16 v17, v1

    .line 146
    .line 147
    move/from16 v16, v12

    .line 148
    .line 149
    :cond_6
    :goto_4
    shr-long v9, v9, v16

    .line 150
    .line 151
    add-int/lit8 v13, v13, 0x1

    .line 152
    .line 153
    move-object/from16 v0, p0

    .line 154
    .line 155
    move/from16 v12, v16

    .line 156
    .line 157
    move-object/from16 v1, v17

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_7
    move-object/from16 v17, v1

    .line 161
    .line 162
    move v0, v12

    .line 163
    if-ne v11, v0, :cond_9

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_8
    move-object/from16 v17, v1

    .line 167
    .line 168
    :goto_5
    if-eq v8, v6, :cond_9

    .line 169
    .line 170
    add-int/lit8 v8, v8, 0x1

    .line 171
    .line 172
    move-object/from16 v0, p0

    .line 173
    .line 174
    move-object/from16 v1, v17

    .line 175
    .line 176
    goto/16 :goto_0

    .line 177
    .line 178
    :cond_9
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 179
    .line 180
    return-object v0
.end method
