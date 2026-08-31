.class public final Lc/a;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:Z

.field public final synthetic r:LB5/a;


# direct methods
.method public constructor <init>(ZLB5/a;I)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lc/a;->q:Z

    .line 2
    .line 3
    iput-object p2, p0, Lc/a;->r:LB5/a;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, LP/o;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    const/4 p2, 0x1

    .line 9
    invoke-static {p2}, LP/b;->w(I)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    iget-boolean v0, p0, Lc/a;->q:Z

    .line 14
    .line 15
    iget-object v1, p0, Lc/a;->r:LB5/a;

    .line 16
    .line 17
    invoke-static {v0, v1, p1, p2}, Ll6/d;->d(ZLB5/a;LP/o;I)V

    .line 18
    .line 19
    .line 20
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 21
    .line 22
    return-object p1
.end method
