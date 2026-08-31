.class public final LE/z;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LB5/a;

.field public final synthetic r:Lc0/m;

.field public final synthetic s:LE/K;

.field public final synthetic t:LB5/e;


# direct methods
.method public constructor <init>(LB5/a;Lc0/m;LE/K;LB5/e;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LE/z;->q:LB5/a;

    .line 2
    .line 3
    iput-object p2, p0, LE/z;->r:Lc0/m;

    .line 4
    .line 5
    iput-object p3, p0, LE/z;->s:LE/K;

    .line 6
    .line 7
    iput-object p4, p0, LE/z;->t:LB5/e;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, LP/o;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-static {p1}, LP/b;->w(I)I

    .line 11
    .line 12
    .line 13
    move-result v5

    .line 14
    iget-object v0, p0, LE/z;->q:LB5/a;

    .line 15
    .line 16
    iget-object v1, p0, LE/z;->r:Lc0/m;

    .line 17
    .line 18
    iget-object v2, p0, LE/z;->s:LE/K;

    .line 19
    .line 20
    iget-object v3, p0, LE/z;->t:LB5/e;

    .line 21
    .line 22
    invoke-static/range {v0 .. v5}, LE/C;->a(LB5/a;Lc0/m;LE/K;LB5/e;LP/o;I)V

    .line 23
    .line 24
    .line 25
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 26
    .line 27
    return-object p1
.end method
