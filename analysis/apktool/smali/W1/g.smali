.class public final synthetic LW1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:Lkotlin/jvm/internal/u;

.field public final synthetic r:Lkotlin/jvm/internal/u;

.field public final synthetic s:LW1/j;

.field public final synthetic t:Z

.field public final synthetic u:Ln5/j;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/u;Lkotlin/jvm/internal/u;LW1/j;ZLn5/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW1/g;->q:Lkotlin/jvm/internal/u;

    iput-object p2, p0, LW1/g;->r:Lkotlin/jvm/internal/u;

    iput-object p3, p0, LW1/g;->s:LW1/j;

    iput-boolean p4, p0, LW1/g;->t:Z

    iput-object p5, p0, LW1/g;->u:Ln5/j;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, LT1/d;

    .line 2
    .line 3
    const-string v0, "entry"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LW1/g;->q:Lkotlin/jvm/internal/u;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iput-boolean v1, v0, Lkotlin/jvm/internal/u;->q:Z

    .line 12
    .line 13
    iget-object v0, p0, LW1/g;->r:Lkotlin/jvm/internal/u;

    .line 14
    .line 15
    iput-boolean v1, v0, Lkotlin/jvm/internal/u;->q:Z

    .line 16
    .line 17
    iget-object v0, p0, LW1/g;->s:LW1/j;

    .line 18
    .line 19
    iget-boolean v1, p0, LW1/g;->t:Z

    .line 20
    .line 21
    iget-object v2, p0, LW1/g;->u:Ln5/j;

    .line 22
    .line 23
    invoke-virtual {v0, p1, v1, v2}, LW1/j;->m(LT1/d;ZLn5/j;)V

    .line 24
    .line 25
    .line 26
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 27
    .line 28
    return-object p1
.end method
