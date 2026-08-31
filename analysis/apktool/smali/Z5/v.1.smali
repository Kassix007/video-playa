.class public final LZ5/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV5/a;


# static fields
.field public static final a:LZ5/v;

.field public static final b:LZ5/U;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LZ5/v;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LZ5/v;->a:LZ5/v;

    .line 7
    .line 8
    new-instance v0, LZ5/U;

    .line 9
    .line 10
    const-string v1, "kotlin.Float"

    .line 11
    .line 12
    sget-object v2, LX5/d;->g:LX5/d;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, LZ5/U;-><init>(Ljava/lang/String;LX5/e;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, LZ5/v;->b:LZ5/U;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final b()LX5/f;
    .locals 1

    .line 1
    sget-object v0, LZ5/v;->b:LZ5/U;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LY5/b;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1}, LY5/b;->x()F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
