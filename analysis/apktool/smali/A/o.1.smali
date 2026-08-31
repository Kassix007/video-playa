.class public final LA/o;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:Lz0/J;

.field public final synthetic r:Lz0/B;

.field public final synthetic s:LB0/T;

.field public final synthetic t:I

.field public final synthetic u:I

.field public final synthetic v:LA/q;


# direct methods
.method public constructor <init>(Lz0/J;Lz0/B;LB0/T;IILA/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA/o;->q:Lz0/J;

    .line 2
    .line 3
    iput-object p2, p0, LA/o;->r:Lz0/B;

    .line 4
    .line 5
    iput-object p3, p0, LA/o;->s:LB0/T;

    .line 6
    .line 7
    iput p4, p0, LA/o;->t:I

    .line 8
    .line 9
    iput p5, p0, LA/o;->u:I

    .line 10
    .line 11
    iput-object p6, p0, LA/o;->v:LA/q;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lz0/I;

    .line 3
    .line 4
    iget-object p1, p0, LA/o;->s:LB0/T;

    .line 5
    .line 6
    invoke-interface {p1}, Lz0/E;->getLayoutDirection()LW0/l;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    iget-object p1, p0, LA/o;->v:LA/q;

    .line 11
    .line 12
    iget-object v6, p1, LA/q;->a:Lc0/e;

    .line 13
    .line 14
    iget-object v1, p0, LA/o;->q:Lz0/J;

    .line 15
    .line 16
    iget-object v2, p0, LA/o;->r:Lz0/B;

    .line 17
    .line 18
    iget v4, p0, LA/o;->t:I

    .line 19
    .line 20
    iget v5, p0, LA/o;->u:I

    .line 21
    .line 22
    invoke-static/range {v0 .. v6}, LA/n;->b(Lz0/I;Lz0/J;Lz0/B;LW0/l;IILc0/e;)V

    .line 23
    .line 24
    .line 25
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 26
    .line 27
    return-object p1
.end method
