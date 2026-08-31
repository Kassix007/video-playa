.class public final Lc/j;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:Z

.field public final synthetic r:LB5/e;

.field public final synthetic s:I


# direct methods
.method public constructor <init>(ZLB5/e;I)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lc/j;->q:Z

    .line 2
    .line 3
    iput-object p2, p0, Lc/j;->r:LB5/e;

    .line 4
    .line 5
    iput p3, p0, Lc/j;->s:I

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 9
    .line 10
    .line 11
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
    iget p2, p0, Lc/j;->s:I

    .line 9
    .line 10
    or-int/lit8 p2, p2, 0x1

    .line 11
    .line 12
    invoke-static {p2}, LP/b;->w(I)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    iget-boolean v0, p0, Lc/j;->q:Z

    .line 17
    .line 18
    iget-object v1, p0, Lc/j;->r:LB5/e;

    .line 19
    .line 20
    invoke-static {v0, v1, p1, p2}, Ln5/A;->f(ZLB5/e;LP/o;I)V

    .line 21
    .line 22
    .line 23
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 24
    .line 25
    return-object p1
.end method
