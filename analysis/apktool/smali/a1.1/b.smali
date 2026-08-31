.class public final La1/b;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# static fields
.field public static final q:La1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La1/b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La1/b;->q:La1/b;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, LI0/i;

    .line 2
    .line 3
    sget-object v0, LI0/r;->a:[LH5/k;

    .line 4
    .line 5
    sget-object v0, LI0/p;->u:LI0/s;

    .line 6
    .line 7
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 8
    .line 9
    invoke-virtual {p1, v0, v1}, LI0/i;->j(LI0/s;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-object v1
.end method
