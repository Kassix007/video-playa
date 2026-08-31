.class public final synthetic La5/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, La5/n;->q:I

    iput-object p1, p0, La5/n;->r:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, La5/n;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v5, p1

    .line 7
    check-cast v5, LP/o;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    and-int/lit8 p2, p1, 0x3

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    const/4 v1, 0x1

    .line 19
    if-eq p2, v0, :cond_0

    .line 20
    .line 21
    move p2, v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p2, 0x0

    .line 24
    :goto_0
    and-int/2addr p1, v1

    .line 25
    invoke-virtual {v5, p1, p2}, LP/o;->K(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    const p1, 0x7f07007c

    .line 32
    .line 33
    .line 34
    const/4 p2, 0x6

    .line 35
    invoke-static {p1, v5, p2}, Lcom/google/android/gms/internal/measurement/n2;->F(ILP/o;I)Lo0/b;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object p1, p0, La5/n;->r:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-static {p1}, Lj0/B;->b(I)J

    .line 46
    .line 47
    .line 48
    move-result-wide v3

    .line 49
    const/16 p1, 0x1e

    .line 50
    .line 51
    int-to-float p1, p1

    .line 52
    sget-object p2, Lc0/j;->q:Lc0/j;

    .line 53
    .line 54
    invoke-static {p2, p1}, Landroidx/compose/foundation/layout/c;->c(Lc0/m;F)Lc0/m;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const/4 p2, 0x4

    .line 59
    int-to-float p2, p2

    .line 60
    invoke-static {p1, p2}, Landroidx/compose/foundation/layout/b;->a(Lc0/m;F)Lc0/m;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    const/16 v6, 0x1b0

    .line 65
    .line 66
    invoke-static/range {v1 .. v6}, LM/x;->a(Lo0/b;Lc0/m;JLP/o;I)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-virtual {v5}, LP/o;->N()V

    .line 71
    .line 72
    .line 73
    :goto_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 74
    .line 75
    return-object p1

    .line 76
    :pswitch_0
    move-object v7, p1

    .line 77
    check-cast v7, LP/o;

    .line 78
    .line 79
    check-cast p2, Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    and-int/lit8 p2, p1, 0x3

    .line 86
    .line 87
    const/4 v0, 0x2

    .line 88
    const/4 v1, 0x0

    .line 89
    const/4 v2, 0x1

    .line 90
    if-eq p2, v0, :cond_2

    .line 91
    .line 92
    move p2, v2

    .line 93
    goto :goto_2

    .line 94
    :cond_2
    move p2, v1

    .line 95
    :goto_2
    and-int/2addr p1, v2

    .line 96
    invoke-virtual {v7, p1, p2}, LP/o;->K(IZ)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_3

    .line 101
    .line 102
    const p1, 0x7f070088

    .line 103
    .line 104
    .line 105
    invoke-static {p1, v7, v1}, Lcom/google/android/gms/internal/measurement/n2;->F(ILP/o;I)Lo0/b;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    sget-object v2, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 110
    .line 111
    iget-object p1, p0, La5/n;->r:Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    invoke-static {p1}, Lj0/B;->b(I)J

    .line 118
    .line 119
    .line 120
    move-result-wide p1

    .line 121
    new-instance v6, Lj0/j;

    .line 122
    .line 123
    const/4 v1, 0x5

    .line 124
    invoke-direct {v6, p1, p2, v1}, Lj0/j;-><init>(JI)V

    .line 125
    .line 126
    .line 127
    const/16 v8, 0x1b0

    .line 128
    .line 129
    const/16 v9, 0x38

    .line 130
    .line 131
    const/4 v1, 0x0

    .line 132
    const/4 v3, 0x0

    .line 133
    const/4 v4, 0x0

    .line 134
    const/4 v5, 0x0

    .line 135
    invoke-static/range {v0 .. v9}, LD5/a;->c(Lo0/b;Ljava/lang/String;Lc0/m;Lc0/e;Lz0/j;FLj0/j;LP/o;II)V

    .line 136
    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_3
    invoke-virtual {v7}, LP/o;->N()V

    .line 140
    .line 141
    .line 142
    :goto_3
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 143
    .line 144
    return-object p1

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
