.class public final synthetic Lf5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:I

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;

.field public final synthetic v:Ljava/lang/Object;

.field public final synthetic w:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILF/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LB5/c;I)V
    .locals 0

    .line 1
    const/4 p7, 0x0

    iput p7, p0, Lf5/b;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lf5/b;->s:I

    iput-object p2, p0, Lf5/b;->t:Ljava/lang/Object;

    iput-object p3, p0, Lf5/b;->r:Ljava/lang/String;

    iput-object p4, p0, Lf5/b;->u:Ljava/lang/Object;

    iput-object p5, p0, Lf5/b;->v:Ljava/lang/Object;

    iput-object p6, p0, Lf5/b;->w:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lc0/m;Lu2/n;Ljava/lang/String;Lc0/e;Lz0/j;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lf5/b;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf5/b;->t:Ljava/lang/Object;

    iput-object p2, p0, Lf5/b;->u:Ljava/lang/Object;

    iput-object p3, p0, Lf5/b;->r:Ljava/lang/String;

    iput-object p4, p0, Lf5/b;->v:Ljava/lang/Object;

    iput-object p5, p0, Lf5/b;->w:Ljava/lang/Object;

    iput p6, p0, Lf5/b;->s:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lf5/b;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf5/b;->t:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Lc0/m;

    .line 10
    .line 11
    iget-object v0, p0, Lf5/b;->u:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v2, v0

    .line 14
    check-cast v2, Lu2/n;

    .line 15
    .line 16
    iget-object v0, p0, Lf5/b;->v:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v4, v0

    .line 19
    check-cast v4, Lc0/e;

    .line 20
    .line 21
    iget-object v0, p0, Lf5/b;->w:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v5, v0

    .line 24
    check-cast v5, Lz0/j;

    .line 25
    .line 26
    move-object v6, p1

    .line 27
    check-cast v6, LP/o;

    .line 28
    .line 29
    check-cast p2, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget p1, p0, Lf5/b;->s:I

    .line 35
    .line 36
    or-int/lit8 p1, p1, 0x1

    .line 37
    .line 38
    invoke-static {p1}, LP/b;->w(I)I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    iget-object v3, p0, Lf5/b;->r:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static/range {v1 .. v7}, Lu2/u;->c(Lc0/m;Lu2/n;Ljava/lang/String;Lc0/e;Lz0/j;LP/o;I)V

    .line 45
    .line 46
    .line 47
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 48
    .line 49
    return-object p1

    .line 50
    :pswitch_0
    iget-object v0, p0, Lf5/b;->t:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v2, v0

    .line 53
    check-cast v2, LF/e;

    .line 54
    .line 55
    iget-object v0, p0, Lf5/b;->u:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v4, v0

    .line 58
    check-cast v4, Ljava/lang/String;

    .line 59
    .line 60
    iget-object v0, p0, Lf5/b;->v:Ljava/lang/Object;

    .line 61
    .line 62
    move-object v5, v0

    .line 63
    check-cast v5, Ljava/lang/String;

    .line 64
    .line 65
    iget-object v0, p0, Lf5/b;->w:Ljava/lang/Object;

    .line 66
    .line 67
    move-object v6, v0

    .line 68
    check-cast v6, LB5/c;

    .line 69
    .line 70
    move-object v7, p1

    .line 71
    check-cast v7, LP/o;

    .line 72
    .line 73
    check-cast p2, Ljava/lang/Integer;

    .line 74
    .line 75
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    const/4 p1, 0x1

    .line 79
    invoke-static {p1}, LP/b;->w(I)I

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    iget v1, p0, Lf5/b;->s:I

    .line 84
    .line 85
    iget-object v3, p0, Lf5/b;->r:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static/range {v1 .. v8}, LE3/h;->g(ILF/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LB5/c;LP/o;I)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
