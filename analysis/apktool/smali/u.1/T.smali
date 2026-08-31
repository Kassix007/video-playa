.class public final Lu/T;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Lu/d0;


# direct methods
.method public synthetic constructor <init>(Lu/d0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lu/T;->q:I

    iput-object p1, p0, Lu/T;->r:Lu/d0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lu/T;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object p1, p0, Lu/T;->r:Lu/d0;

    .line 13
    .line 14
    iput-wide v0, p1, Lu/d0;->C:J

    .line 15
    .line 16
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 17
    .line 18
    return-object p1

    .line 19
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    iget-object p1, p0, Lu/T;->r:Lu/d0;

    .line 26
    .line 27
    iget-wide v2, p1, Lu/d0;->C:J

    .line 28
    .line 29
    sub-long v2, v0, v2

    .line 30
    .line 31
    iput-wide v0, p1, Lu/d0;->C:J

    .line 32
    .line 33
    long-to-double v0, v2

    .line 34
    iget v2, p1, Lu/d0;->G:F

    .line 35
    .line 36
    float-to-double v2, v2

    .line 37
    div-double/2addr v0, v2

    .line 38
    invoke-static {v0, v1}, LD5/a;->H(D)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    iget-object v2, p1, Lu/d0;->D:Lr/C;

    .line 43
    .line 44
    invoke-virtual {v2}, Lr/C;->h()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    const/4 v4, 0x0

    .line 49
    if-eqz v3, :cond_4

    .line 50
    .line 51
    iget-object v3, v2, Lr/C;->a:[Ljava/lang/Object;

    .line 52
    .line 53
    iget v5, v2, Lr/C;->b:I

    .line 54
    .line 55
    const/4 v6, 0x0

    .line 56
    move v7, v6

    .line 57
    :goto_0
    if-ge v7, v5, :cond_0

    .line 58
    .line 59
    aget-object v8, v3, v7

    .line 60
    .line 61
    check-cast v8, Lu/S;

    .line 62
    .line 63
    invoke-static {p1, v8, v0, v1}, Lu/d0;->q(Lu/d0;Lu/S;J)V

    .line 64
    .line 65
    .line 66
    const/4 v9, 0x1

    .line 67
    iput-boolean v9, v8, Lu/S;->c:Z

    .line 68
    .line 69
    add-int/lit8 v7, v7, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    iget-object v3, p1, Lu/d0;->v:Lu/v0;

    .line 73
    .line 74
    if-eqz v3, :cond_1

    .line 75
    .line 76
    invoke-virtual {v3}, Lu/v0;->o()V

    .line 77
    .line 78
    .line 79
    :cond_1
    iget v3, v2, Lr/C;->b:I

    .line 80
    .line 81
    iget-object v5, v2, Lr/C;->a:[Ljava/lang/Object;

    .line 82
    .line 83
    invoke-static {v6, v3}, LD5/a;->O(II)LG5/d;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    iget v8, v7, LG5/b;->q:I

    .line 88
    .line 89
    iget v7, v7, LG5/b;->r:I

    .line 90
    .line 91
    if-gt v8, v7, :cond_3

    .line 92
    .line 93
    :goto_1
    sub-int v9, v8, v6

    .line 94
    .line 95
    aget-object v10, v5, v8

    .line 96
    .line 97
    aput-object v10, v5, v9

    .line 98
    .line 99
    aget-object v9, v5, v8

    .line 100
    .line 101
    check-cast v9, Lu/S;

    .line 102
    .line 103
    iget-boolean v9, v9, Lu/S;->c:Z

    .line 104
    .line 105
    if-eqz v9, :cond_2

    .line 106
    .line 107
    add-int/lit8 v6, v6, 0x1

    .line 108
    .line 109
    :cond_2
    if-eq v8, v7, :cond_3

    .line 110
    .line 111
    add-int/lit8 v8, v8, 0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_3
    sub-int v7, v3, v6

    .line 115
    .line 116
    invoke-static {v7, v3, v4, v5}, Ln5/k;->J0(IILjava/lang/Object;[Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    iget v3, v2, Lr/C;->b:I

    .line 120
    .line 121
    sub-int/2addr v3, v6

    .line 122
    iput v3, v2, Lr/C;->b:I

    .line 123
    .line 124
    :cond_4
    iget-object v2, p1, Lu/d0;->E:Lu/S;

    .line 125
    .line 126
    if-eqz v2, :cond_6

    .line 127
    .line 128
    iget-wide v5, p1, Lu/d0;->w:J

    .line 129
    .line 130
    iput-wide v5, v2, Lu/S;->g:J

    .line 131
    .line 132
    invoke-static {p1, v2, v0, v1}, Lu/d0;->q(Lu/d0;Lu/S;J)V

    .line 133
    .line 134
    .line 135
    iget v0, v2, Lu/S;->d:F

    .line 136
    .line 137
    invoke-virtual {p1, v0}, Lu/d0;->y(F)V

    .line 138
    .line 139
    .line 140
    iget v0, v2, Lu/S;->d:F

    .line 141
    .line 142
    const/high16 v1, 0x3f800000    # 1.0f

    .line 143
    .line 144
    cmpg-float v0, v0, v1

    .line 145
    .line 146
    if-nez v0, :cond_5

    .line 147
    .line 148
    iput-object v4, p1, Lu/d0;->E:Lu/S;

    .line 149
    .line 150
    :cond_5
    invoke-virtual {p1}, Lu/d0;->x()V

    .line 151
    .line 152
    .line 153
    :cond_6
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 154
    .line 155
    return-object p1

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
