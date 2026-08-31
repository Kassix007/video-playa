.class public final LZ0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/C;


# instance fields
.field public final synthetic a:LZ0/r;

.field public final synthetic b:LB0/L;


# direct methods
.method public constructor <init>(LZ0/r;LB0/L;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LZ0/e;->a:LZ0/r;

    .line 5
    .line 6
    iput-object p2, p0, LZ0/e;->b:LB0/L;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(LB0/T;Ljava/util/List;J)Lz0/D;
    .locals 4

    .line 1
    iget-object p2, p0, LZ0/e;->a:LZ0/r;

    .line 2
    .line 3
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sget-object v1, Ln5/t;->q:Ln5/t;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {p3, p4}, LW0/a;->j(J)I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    invoke-static {p3, p4}, LW0/a;->i(J)I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    sget-object p4, LZ0/b;->s:LZ0/b;

    .line 20
    .line 21
    invoke-interface {p1, p2, p3, v1, p4}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :cond_0
    invoke-static {p3, p4}, LW0/a;->j(J)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v2, 0x0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p2, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {p3, p4}, LW0/a;->j(J)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-virtual {v0, v3}, Landroid/view/View;->setMinimumWidth(I)V

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-static {p3, p4}, LW0/a;->i(J)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    invoke-virtual {p2, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {p3, p4}, LW0/a;->i(J)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    invoke-virtual {v0, v2}, Landroid/view/View;->setMinimumHeight(I)V

    .line 59
    .line 60
    .line 61
    :cond_2
    invoke-static {p3, p4}, LW0/a;->j(J)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-static {p3, p4}, LW0/a;->h(J)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-virtual {p2}, LZ0/j;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 77
    .line 78
    invoke-static {p2, v0, v2, v3}, LZ0/j;->l(LZ0/r;III)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-static {p3, p4}, LW0/a;->i(J)I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    invoke-static {p3, p4}, LW0/a;->g(J)I

    .line 87
    .line 88
    .line 89
    move-result p3

    .line 90
    invoke-virtual {p2}, LZ0/j;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 91
    .line 92
    .line 93
    move-result-object p4

    .line 94
    invoke-static {p4}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iget p4, p4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 98
    .line 99
    invoke-static {p2, v2, p3, p4}, LZ0/j;->l(LZ0/r;III)I

    .line 100
    .line 101
    .line 102
    move-result p3

    .line 103
    invoke-virtual {p2, v0, p3}, Landroid/view/View;->measure(II)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 107
    .line 108
    .line 109
    move-result p3

    .line 110
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 111
    .line 112
    .line 113
    move-result p4

    .line 114
    new-instance v0, LZ0/c;

    .line 115
    .line 116
    iget-object v2, p0, LZ0/e;->b:LB0/L;

    .line 117
    .line 118
    const/4 v3, 0x1

    .line 119
    invoke-direct {v0, p2, v2, v3}, LZ0/c;-><init>(LZ0/r;LB0/L;I)V

    .line 120
    .line 121
    .line 122
    invoke-interface {p1, p3, p4, v1, v0}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    return-object p1
.end method
