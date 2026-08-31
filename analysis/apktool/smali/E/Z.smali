.class public final LE/Z;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:I

.field public final synthetic s:I

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;


# direct methods
.method public constructor <init>(IILr/B;LE/Y;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LE/Z;->q:I

    .line 1
    iput p1, p0, LE/Z;->r:I

    iput p2, p0, LE/Z;->s:I

    iput-object p3, p0, LE/Z;->t:Ljava/lang/Object;

    iput-object p4, p0, LE/Z;->u:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>([Lz0/J;Lt/f;II)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LE/Z;->q:I

    .line 2
    iput-object p1, p0, LE/Z;->t:Ljava/lang/Object;

    iput-object p2, p0, LE/Z;->u:Ljava/lang/Object;

    iput p3, p0, LE/Z;->r:I

    iput p4, p0, LE/Z;->s:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LE/Z;->q:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Lz0/I;

    .line 11
    .line 12
    iget-object v2, v0, LE/Z;->t:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, [Lz0/J;

    .line 15
    .line 16
    iget-object v3, v0, LE/Z;->u:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Lt/f;

    .line 19
    .line 20
    array-length v4, v2

    .line 21
    const/4 v5, 0x0

    .line 22
    :goto_0
    if-ge v5, v4, :cond_1

    .line 23
    .line 24
    aget-object v6, v2, v5

    .line 25
    .line 26
    if-eqz v6, :cond_0

    .line 27
    .line 28
    iget-object v7, v3, Lt/f;->a:Lt/l;

    .line 29
    .line 30
    iget-object v8, v7, Lt/l;->b:Lc0/e;

    .line 31
    .line 32
    iget v7, v6, Lz0/J;->q:I

    .line 33
    .line 34
    iget v9, v6, Lz0/J;->r:I

    .line 35
    .line 36
    int-to-long v10, v7

    .line 37
    const/16 v7, 0x20

    .line 38
    .line 39
    shl-long/2addr v10, v7

    .line 40
    int-to-long v12, v9

    .line 41
    const-wide v14, 0xffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long/2addr v12, v14

    .line 47
    or-long v9, v10, v12

    .line 48
    .line 49
    iget v11, v0, LE/Z;->r:I

    .line 50
    .line 51
    int-to-long v11, v11

    .line 52
    shl-long/2addr v11, v7

    .line 53
    iget v13, v0, LE/Z;->s:I

    .line 54
    .line 55
    move/from16 v16, v7

    .line 56
    .line 57
    move-object/from16 p1, v8

    .line 58
    .line 59
    int-to-long v7, v13

    .line 60
    and-long/2addr v7, v14

    .line 61
    or-long/2addr v11, v7

    .line 62
    sget-object v13, LW0/l;->q:LW0/l;

    .line 63
    .line 64
    move-object/from16 v8, p1

    .line 65
    .line 66
    invoke-virtual/range {v8 .. v13}, Lc0/e;->a(JJLW0/l;)J

    .line 67
    .line 68
    .line 69
    move-result-wide v7

    .line 70
    shr-long v9, v7, v16

    .line 71
    .line 72
    long-to-int v9, v9

    .line 73
    and-long/2addr v7, v14

    .line 74
    long-to-int v7, v7

    .line 75
    invoke-static {v1, v6, v9, v7}, Lz0/I;->d(Lz0/I;Lz0/J;II)V

    .line 76
    .line 77
    .line 78
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 82
    .line 83
    return-object v1

    .line 84
    :pswitch_0
    move-object/from16 v1, p1

    .line 85
    .line 86
    check-cast v1, LE/i;

    .line 87
    .line 88
    iget-object v2, v1, LE/i;->c:LE/q;

    .line 89
    .line 90
    invoke-interface {v2}, LE/q;->getKey()LB5/c;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    iget v3, v1, LE/i;->a:I

    .line 95
    .line 96
    iget v4, v0, LE/Z;->r:I

    .line 97
    .line 98
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    iget v1, v1, LE/i;->b:I

    .line 103
    .line 104
    add-int/2addr v1, v3

    .line 105
    add-int/lit8 v1, v1, -0x1

    .line 106
    .line 107
    iget v5, v0, LE/Z;->s:I

    .line 108
    .line 109
    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-gt v4, v1, :cond_4

    .line 114
    .line 115
    :goto_1
    if-eqz v2, :cond_2

    .line 116
    .line 117
    sub-int v5, v4, v3

    .line 118
    .line 119
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    invoke-interface {v2, v5}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    if-nez v5, :cond_3

    .line 128
    .line 129
    :cond_2
    new-instance v5, LE/g;

    .line 130
    .line 131
    invoke-direct {v5, v4}, LE/g;-><init>(I)V

    .line 132
    .line 133
    .line 134
    :cond_3
    iget-object v6, v0, LE/Z;->t:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v6, Lr/B;

    .line 137
    .line 138
    invoke-virtual {v6, v4, v5}, Lr/B;->g(ILjava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    iget-object v6, v0, LE/Z;->u:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v6, LE/Y;

    .line 144
    .line 145
    iget-object v7, v6, LE/Y;->d:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v7, [Ljava/lang/Object;

    .line 148
    .line 149
    iget v6, v6, LE/Y;->b:I

    .line 150
    .line 151
    sub-int v6, v4, v6

    .line 152
    .line 153
    aput-object v5, v7, v6

    .line 154
    .line 155
    if-eq v4, v1, :cond_4

    .line 156
    .line 157
    add-int/lit8 v4, v4, 0x1

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_4
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 161
    .line 162
    return-object v1

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
